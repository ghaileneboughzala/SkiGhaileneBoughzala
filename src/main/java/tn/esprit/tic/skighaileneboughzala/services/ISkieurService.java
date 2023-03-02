package tn.esprit.tic.skighaileneboughzala.services;

import tn.esprit.tic.skighaileneboughzala.entities.Skieur;

import java.util.List;
import java.util.Optional;

public interface ISkieurService {
    @Override
    ISkieurService(Long numSkieur, Long numPiste);

    @Override
    ISkieurService(Long numSkieur, Long numPiste);

    @Override
    ISkieurService(Long numSkieur, Long numPiste);

    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);


    void removeSkieur (Long numSkieur);
    Optional<Skieur> retrieveSkieur (Long numSkieur);
    Skieur updateSkieur (Skieur Skieur);

    @Override
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);

}
