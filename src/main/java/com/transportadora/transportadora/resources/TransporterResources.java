package com.transportadora.transportadora.resources;

import com.transportadora.transportadora.domain.Transporter;
import com.transportadora.transportadora.services.TransporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/transporters")
public class TransporterResources {

    @Autowired
    private TransporterService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Transporter> find(@PathVariable Integer id) {
        Transporter obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Transporter obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Transporter obj, @PathVariable Integer id) {
        obj.setId(id);
        obj = service.update(obj);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);

        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Transporter>> findAll() {
        List<Transporter> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/ufs", method = RequestMethod.GET)
    public ResponseEntity<List<String>> findUfs() {
        List<Transporter> list = service.findAll();
        List<String> ufs = list.stream().map(obj -> obj.getUf()).collect(Collectors.toList());
        return ResponseEntity.ok().body(ufs);
    }

    @RequestMapping(value = "/cities", method = RequestMethod.GET)
    public ResponseEntity<List<String>> findCities() {
        List<Transporter> list = service.findAll();
        List<String> citeis = list.stream().map(obj -> obj.getCity()).collect(Collectors.toList());
        return ResponseEntity.ok().body(citeis);
    }

}
