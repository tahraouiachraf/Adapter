import computer.*;
import computer.adapter.HdmiVgaAdapter;
import computer.adapter.HdmiVgaAdapterH;

public class Test {

    public static void main(String[] args) {
        UniteCentre uniteCentre = new UniteCentre();
        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour");
        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonsoir Master II-BDCC Design pattern");

        HdmiVgaAdapterH hdmiVgaAdapterH = new HdmiVgaAdapterH();
        uniteCentre.setVga(hdmiVgaAdapterH);
        hdmiVgaAdapterH.print("Test");

        uniteCentre.setVga(new SuperVP());
        System.out.println("Hello");

        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        System.out.println(hdmiVgaAdapter1);
        uniteCentre.print("Bonsoir");
    }
}
