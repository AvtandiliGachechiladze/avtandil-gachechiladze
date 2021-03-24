package ge.edu.btu.avtandil.gachechiladze.regform;

public class Pet {
    public String Sakheli;
    private String Jishi;
    private String Sqesi;
    private int Asaki;

    public Pet(){

    }

    public void SetPetOptions(String sakheli, String jishi, String sqesi, int asaki){
        this.Sakheli = sakheli;
        this.Jishi = jishi;
        this.Sqesi = sqesi;
        this.Asaki = asaki;
    }

    public String ViewPetInfo(){
        return "Sakheli: " + Sakheli + " Jishi:" + Jishi + " Sqesi:" + Sqesi + " Asaki:" + Asaki;
    }
}
