package com.example.gridmanager.Service;

import com.example.gridmanager.Model.Echipa;
import com.example.gridmanager.Model.Pilot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GridmanagerService {

    private List<Echipa> echipe = new ArrayList<>();
    private List<Pilot> piloti = new ArrayList<>();
    private Long echipaIdCounter = 1L;
    private Long pilotIdCounter = 1L;

    // ================== Gestionarea echipelor ==================

    // Returnează lista tuturor echipelor
    public List<Echipa> getEchipe() {
        return echipe;
    }

    // Adaugă o echipă nouă
    public void addEchipa(Echipa echipa) {
        echipa.setId(echipaIdCounter++);
        echipe.add(echipa);
    }

    // Găsește o echipă după ID
    public Echipa findEchipaById(Long id) {
        return echipe.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Găsește o echipă după nume
    public Echipa findEchipaByName(String name) {
        return echipe.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    // Actualizează o echipă
    public void updateEchipa(Echipa updatedEchipa) {
        echipe.replaceAll(e -> e.getId().equals(updatedEchipa.getId()) ? updatedEchipa : e);
    }

    // Șterge o echipă după ID
    public void deleteEchipa(Long id) {
        echipe.removeIf(e -> e.getId().equals(id));
    }

    // ================== Gestionarea piloților ==================

    // Returnează lista tuturor piloților
    public List<Pilot> getPiloti() {
        return piloti;
    }

    // Adaugă un pilot nou
    public void addPilot(Pilot pilot) {
        pilot.setId(pilotIdCounter++);
        piloti.add(pilot);
    }

    // Găsește un pilot după ID
    public Pilot findPilotById(Long id) {
        return piloti.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Actualizează un pilot
    public void updatePilot(Pilot updatedPilot) {
        piloti.replaceAll(p -> p.getId().equals(updatedPilot.getId()) ? updatedPilot : p);
    }

    // Șterge un pilot după ID
    public void deletePilot(Long id) {
        piloti.removeIf(p -> p.getId().equals(id));
    }
}
