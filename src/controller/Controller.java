/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Cena;
import domain.Ponuda;
import domain.PravnoLice;
import domain.PravnoLiceDetalji;
import domain.PravnoLiceOsnovno;
import domain.Proizvod;
import domain.Racun;
import domain.RacunList;
import domain.RacuniPouzecem;
import domain.RacuniVirmanom;
import domain.StavkaRacuna;
import domain.StavkaRezervacije;
import domain.Uplata;
import java.util.List;
import repository.Repository;
import repository.db.impl.RepositoryDbCena;
import repository.db.impl.RepositoryDbJedinicaMere;
import repository.db.impl.RepositoryDbPonuda;
import repository.db.impl.RepositoryDbPravnoLice;
import repository.db.impl.RepositoryDbPravnoLiceDetalji;
import repository.db.impl.RepositoryDbPravnoLiceOsnovno;
import repository.db.impl.RepositoryDbPravnoLiceView2;
import repository.db.impl.RepositoryDbProizvod;
import repository.db.impl.RepositoryDbRacun;
import repository.db.impl.RepositoryDbRacunList;
import repository.db.impl.RepositoryDbRacuniPouzecem;
import repository.db.impl.RepositoryDbRacuniVirmanom;
import repository.db.impl.RepositoryDbStavkaPonude;
import repository.db.impl.RepositoryDbStavkaRacuna;
import repository.db.impl.RepositoryDbStavkaRezervacije;
import repository.db.impl.RepositoryDbUplata;

/**
 *
 * @author trifu
 */
public class Controller {

    private static Controller instance;
    private Repository storageCena;
    private Repository storageJedinicaMere;
    private Repository storagePonuda;
    private Repository storagePravnoLice;
    private Repository storagePravnoLiceDetalji;
    private Repository storagePravnoLiceOsnovno;
    private Repository storagePravnoLiceView2;
    private Repository storageProizvod;
    private Repository storageRacun;
    private Repository storageRacunList;
    private Repository storageStavkaPonude;
    private Repository storageStavkaRacuna;
    private Repository storageStavkaRezervacije;
    private Repository storageUplata;
    private Repository storageRacuniVirmanom;
    private Repository storageRacuniPouzecem;

    public Controller() {
        storageCena = new RepositoryDbCena();
        storageJedinicaMere = new RepositoryDbJedinicaMere();
        storagePonuda = new RepositoryDbPonuda();
        storagePravnoLice = new RepositoryDbPravnoLice();
        storagePravnoLiceDetalji = new RepositoryDbPravnoLiceDetalji();
        storagePravnoLiceOsnovno = new RepositoryDbPravnoLiceOsnovno();
        storagePravnoLiceView2 = new RepositoryDbPravnoLiceView2();
        storageProizvod = new RepositoryDbProizvod();
        storageRacun = new RepositoryDbRacun();
        storageRacunList = new RepositoryDbRacunList();
        storageStavkaPonude = new RepositoryDbStavkaPonude();
        storageStavkaRacuna = new RepositoryDbStavkaRacuna();
        storageStavkaRezervacije = new RepositoryDbStavkaRezervacije();
        storageUplata = new RepositoryDbUplata();
        storageRacuniPouzecem = new RepositoryDbRacuniPouzecem();
        storageRacuniVirmanom = new RepositoryDbRacuniVirmanom();

    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public List<Racun> getAllRacuni() throws Exception {
        List<Racun> prijemnice = null;
        storageRacun.connect();
        try {
            prijemnice = storageRacun.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacun.disconnect();
        }
        return prijemnice;
    }

    public void addStavkaRacuna(StavkaRacuna sr) throws Exception {
        storageStavkaRacuna.connect();
        try {
            storageStavkaRacuna.add(sr);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageStavkaRacuna.disconnect();
        }
    }

    public void saveStavkaRacuna(StavkaRacuna sr) throws Exception {
        storageStavkaRacuna.connect();
        try {
            storageStavkaRacuna.save(sr);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageStavkaRacuna.disconnect();
        }
    }

    public void deleteListRacun(RacunList racun) throws Exception {
        storageRacunList.connect();
        try {
            storageRacunList.delete(racun);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacunList.disconnect();
        }
    }

    public void saveListRacun(RacunList racun) throws Exception {
        storageRacunList.connect();
        try {
            storageRacunList.save(racun);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacunList.disconnect();
        }
    }

    public void addRacunList(RacunList racun) throws Exception {
        storageRacunList.connect();
        try {
            storageRacunList.add(racun);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacunList.disconnect();
        }
    }

    public List<RacuniVirmanom> getAllRacuniVirmanom() throws Exception {
        List<RacuniVirmanom> racuniVirmanom = null;
        storageRacuniVirmanom.connect();
        try {
            racuniVirmanom = storageRacuniVirmanom.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacuniVirmanom.disconnect();
        }
        return racuniVirmanom;
    }

    public List<RacuniPouzecem> getAllRacuniPouzecem() throws Exception {
        List<RacuniPouzecem> racuniPouzecem = null;
        storageRacuniPouzecem.connect();
        try {
            racuniPouzecem = storageRacuniPouzecem.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacuniPouzecem.disconnect();
        }
        return racuniPouzecem;
    }

    public void deletePravnoLiceView2(PravnoLice p) throws Exception {
        storagePravnoLiceView2.connect();
        try {
            storagePravnoLiceView2.delete(p);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storagePravnoLiceView2.disconnect();
        }
    }

    public void savePravnoLiceView2(PravnoLice p) throws Exception {
        storagePravnoLiceView2.connect();
        try {
            storagePravnoLiceView2.save(p);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storagePravnoLiceView2.disconnect();
        }
    }

    public void addPravnoLiceiew2(PravnoLice p) throws Exception {
        storagePravnoLiceView2.connect();
        try {
            storagePravnoLiceView2.add(p);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storagePravnoLiceView2.disconnect();
        }
    }

    public List<PravnoLiceOsnovno> getAllPravnoLiceOsnovno() throws Exception {
        List<PravnoLiceOsnovno> plo = null;
        storagePravnoLiceOsnovno.connect();
        try {
            plo = storagePravnoLiceOsnovno.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storagePravnoLiceOsnovno.disconnect();
        }
        return plo;
    }

    public List<PravnoLiceDetalji> getAllPravnoLiceDetalji() throws Exception {
        List<PravnoLiceDetalji> pld = null;
        storagePravnoLiceDetalji.connect();
        try {
            pld = storagePravnoLiceDetalji.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storagePravnoLiceDetalji.disconnect();
        }
        return pld;
    }

    public List<Proizvod> getAllProizvodi() throws Exception {
        List<Proizvod> proizvodi = null;
        storageProizvod.connect();
        try {
            proizvodi = storageProizvod.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageProizvod.disconnect();
        }
        return proizvodi;
    }

    public void addProizvod(Proizvod proizvod) throws Exception {
        storageProizvod.connect();
        try {
            storageProizvod.add(proizvod);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageProizvod.disconnect();
        }
    }

    public void saveProizvod(Proizvod proizvod) throws Exception {
        storageProizvod.connect();
        try {
            storageProizvod.save(proizvod);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageProizvod.disconnect();
        }
    }

    public void deleteProizvod(Proizvod proizvod) throws Exception {
        storageProizvod.connect();
        try {
            storageProizvod.delete(proizvod);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageProizvod.disconnect();
        }
    }

    public List<Proizvod> getAllProizvod() throws Exception {
        List<Proizvod> proizvodi = null;
        storageProizvod.connect();
        try {
            proizvodi = storageProizvod.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageProizvod.disconnect();
        }
        return proizvodi;
    }

    public List<Cena> getAllCena() throws Exception {
        List<Cena> cene = null;
        storageCena.connect();
        try {
            cene = storageCena.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageProizvod.disconnect();
        }
        return cene;
    }

    public void addCena(Cena cena) throws Exception {
        storageCena.connect();
        try {
            storageCena.add(cena);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageCena.disconnect();
        }
    }

    public void saveCenaSaNazivom(Cena cena) throws Exception {
        storageCena.connect();
        try {
            storageCena.saveSaImenom(cena);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageCena.disconnect();
        }
    }

    public void saveCena(Cena cena) throws Exception {
        storageCena.connect();
        try {
            storageCena.save(cena);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageCena.disconnect();
        }
    }

    public List<Uplata> getAllUplate() throws Exception {
        List<Uplata> uplate = null;
        storageUplata.connect();
        try {
            uplate = storageUplata.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageUplata.disconnect();

        }
        return uplate;
    }

    public void saveListRacun(Racun racun) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addRacun(Racun racun) throws Exception {
        storageRacun.connect();
        try {
            storageRacun.add(racun);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacun.disconnect();
        }
    }

    public void saveRacun(Racun racun) throws Exception {
        storageRacun.connect();
        try {
            storageRacun.save(racun);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacun.disconnect();
        }
    }

    public void deleteRacun(Racun racun) throws Exception {
        storageRacun.connect();
        try {
            storageRacun.delete(racun);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacun.disconnect();
        }
    }

    public void addUplata(Uplata u) throws Exception {
        storageUplata.connect();
        try {
            storageUplata.add(u);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageUplata.disconnect();
        }
    }

    public void saveUplata(Uplata u) throws Exception {
        storageUplata.connect();
        try {
            storageUplata.save(u);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageUplata.disconnect();
        }
    }

    public List<StavkaRacuna> getAllStavkeRacuna() throws Exception {
        List<StavkaRacuna> stavkaR = null;
        storageStavkaRacuna.connect();
        try {
            stavkaR = storageStavkaRacuna.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageStavkaRacuna.disconnect();
        }
        return stavkaR;
    }


    public List<StavkaRezervacije> getAllStavkeRezervacije() throws Exception {
        List<StavkaRezervacije> stavkaR = null;
        storageStavkaRezervacije.connect();
        try {
            stavkaR = storageStavkaRezervacije.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageStavkaRezervacije.disconnect();
        }
        return stavkaR;
    }

    public List<Ponuda> getAllPonude() throws Exception {
        List<Ponuda> p = null;
        storagePonuda.connect();
        try {
            p = storagePonuda.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storagePonuda.disconnect();
        }
        return p;
    }

    public void addPonuda(Ponuda p) throws Exception {
        storagePonuda.connect();
        try {
            storagePonuda.add(p);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storagePonuda.disconnect();
        }
    }

    public void savePonuduSaDatumom(Ponuda p) throws Exception {
        storagePonuda.connect();
        try {
            storagePonuda.saveSaImenom(p);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storagePonuda.disconnect();
        }
    }

    public void savePonudu(Ponuda p) throws Exception {
        storagePonuda.connect();
        try {
            storagePonuda.saveSaImenom(p);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storagePonuda.disconnect();
        }
    }

    public void addStavkaRezervacije(StavkaRezervacije sr) throws Exception {
        storageStavkaRezervacije.connect();
        try {
            storageStavkaRezervacije.add(sr);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageStavkaRezervacije.disconnect();
        }
    }

    public void saveStavkaRezervacije(StavkaRezervacije sr) throws Exception {
        storageStavkaRezervacije.connect();
        try {
            storageStavkaRezervacije.save(sr);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageStavkaRezervacije.disconnect();
        }
    }

    public void deleteRacunVirmanom(RacuniVirmanom racunVirmanom) throws Exception {
        storageRacuniVirmanom.connect();
        try {
            storageRacuniVirmanom.delete(racunVirmanom);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacuniVirmanom.disconnect();
        }
    }

    public void deleteRacunPouzecem(RacuniPouzecem racunPouzecem) throws Exception {
        storageRacuniPouzecem.connect();
        try {
            storageRacuniPouzecem.delete(racunPouzecem);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacuniPouzecem.disconnect();
        }
    }

    public void deletePravnoLiceDetalji(PravnoLiceDetalji detalji) throws Exception {
        storagePravnoLiceDetalji.connect();
        try {
            storagePravnoLiceDetalji.delete(detalji);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storagePravnoLiceDetalji.disconnect();
        }
    }

    public void deletePravnoLiceOsnovno(PravnoLiceOsnovno osnovno) throws Exception {
        storagePravnoLiceOsnovno.connect();
        try {
            storagePravnoLiceOsnovno.delete(osnovno);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storagePravnoLiceOsnovno.disconnect();
        }
    }

    public void deleteRacunList(RacunList rac) throws Exception {
        storageRacunList.connect();
        try {
            storageRacunList.delete(rac);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            storageRacunList.disconnect();
        }
    }

}
