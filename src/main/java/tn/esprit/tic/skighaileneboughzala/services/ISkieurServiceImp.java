package tn.esprit.tic.skighaileneboughzala.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.skighaileneboughzala.entities.Piste;
import tn.esprit.tic.skighaileneboughzala.entities.Skieur;
import tn.esprit.tic.skighaileneboughzala.repositories.PisteRepository;
import tn.esprit.tic.skighaileneboughzala.repositories.SkieurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ISkieurServiceImp implements ISkieurService{
    @Autowired
    SkieurRepository skieurRepository;
    PisteRepository pisteRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return  skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }


    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Optional<Skieur> retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur);
    }

    @Override
    public Skieur updateSkieur(Skieur Skieur) {
        return skieurRepository.save(Skieur);
    }

    @Override
    public  Skieur assignSkierToPiste(Long numSkieur, Long numPiste)
 {
     //Récupération des objets
     Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
     Piste piste = pisteRepository.findById(numSkieur).orElse(null);
     if (skieur !=null && piste != null ){
         skieur.getPistes().add(piste);
         /*List<Piste> pistes = skieur.getPistes();
         pistes.add(piste);
         skieur.setPistes(pistes);*/

         //save
         return skieurRepository.save(skieur);
     }
     return null;
        }
        }
