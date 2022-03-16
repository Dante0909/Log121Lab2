package tests;

import org.junit.*;

import framework.de.De;

public class DeTest {

    private De de1;
    private De de2;

    @Before
    public void faireAvant() {
        de1 = new De(6);
        de2 = new De(6);
    }

    @Test
    public void deSuperieurTest() {
        de1.setFaceActuelle(5);
        de2.setFaceActuelle(4);
        assertTrue(de1.compareTo(de2) == 1);
    }

    @Test
    public void deInferieurTest() {
        de1.setFaceActuelle(5);
        de2.setFaceActuelle(4);
        assertTrue(de2.compareTo(de1) == -1);
    }

    @Test
    public void memeDeTest() {
        de1.setFaceActuelle(4);
        assertTrue(de1.compareTo(de1) == 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deNullTest() {
        de1.setFaceActuelle(4);
        de1.compareTo(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deSetSuperieurTest() {
        de1.setFaceActuelle(7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deSetInferieurTest() {
        de1.setFaceActuelle(-1);
    }

    @Test
    public void deSetEtGetTest() {
        de1.setFaceActuelle(2);
        assertTrue(de1.getFaceActuelle() == 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deConstructeurInferieurTest() {
        new De(-1);
    }

    @Test
    public void deRoulerTest() {
        de1.rouler();
        assertTrue(de1.getFaceActuelle() <= de1.getNbFaces());
    }
}