package ge.edu.btu.avtandil.gachechiladze.regform;

public class Pet {
    private String Sakheli;
    private String Jishi;
    private String Sqesi;
    private int Asaki;

    public Pet(String sakheli, String jishi, String sqesi, int asaki){
        this.Sakheli = sakheli;
        this.Jishi = jishi;
        this.Sqesi = sqesi;
        this.Asaki = asaki;
    }

    public void PrintPetInfo(){
        System.out.println(Sakheli + " " + Jishi + " " + Sqesi + " " + Asaki);
    }
}
