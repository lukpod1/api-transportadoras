package com.transportadora.transportadora.services;

import com.transportadora.transportadora.domain.Transporter;
import com.transportadora.transportadora.repositories.TransporterRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransporterService {

    @Autowired
    private TransporterRepository repo;

    public Transporter find(Integer id) {
        Optional<Transporter> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " +id, "Tipo: " + Transporter.class.getName()));
    }

    public Transporter insert(Transporter obj) {
        obj.setId(null);
        return repo.save(obj);
    }

    public Transporter update(Transporter obj) {
        find(obj.getId());
        return repo.save(obj);
    }

    public void delete(Integer id) {
        find(id);
        try {
            repo.deleteById(id);
        }
        catch (DataIntegrityViolationException e) {
            throw new DataIntegrityViolationException("Não é possível excluir uma transportadora");
        }
    }

    public List<Transporter> findAll() {
        return repo.findAll();
    }
}
