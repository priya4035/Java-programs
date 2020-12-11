
public class SolarPanelTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolarPanel monocrystallinePanel = new SolarPanel();
		monocrystallinePanel.TypeOfMounting = "RoofMounted";
		monocrystallinePanel.NoOfInverters = 2;
		monocrystallinePanel.TypeOfConnectingWires = "DC solar Cables";
		monocrystallinePanel.NoOfConnectingWires = 5;

		System.out.println("Detalis of monocrystallinePanel");
		System.out.println("Type of solar panel:" + monocrystallinePanel.TypeOfMounting);
		System.out.println("Number of inverters:" + monocrystallinePanel.NoOfInverters);
		System.out.println("Type of connecting wires:" + monocrystallinePanel.TypeOfConnectingWires);
		System.out.println("Number of Connecting Wires:" + monocrystallinePanel.NoOfConnectingWires);

		monocrystallinePanel.NoOfConnectingWires = 10;
		System.out.println(" Changed Number of Connecting Wires:" + monocrystallinePanel.NoOfConnectingWires);

		SolarPanel polycrystallinePanel = new SolarPanel();
		polycrystallinePanel.TypeOfMounting = "Sloped Roof";
		polycrystallinePanel.NoOfInverters = 4;
		polycrystallinePanel.TypeOfConnectingWires = "AC Connection Cables";
		polycrystallinePanel.NoOfConnectingWires = 5;

		System.out.println("Detalis of polycrystallinePanel");
		System.out.println("Type of solar panel:" + polycrystallinePanel.TypeOfMounting);
		System.out.println("Number of inverters:" + polycrystallinePanel.NoOfInverters);
		System.out.println("Type of connecting wires:" + polycrystallinePanel.TypeOfConnectingWires);
		System.out.println("Number of Connecting Wires:" + polycrystallinePanel.NoOfConnectingWires);

		polycrystallinePanel.NoOfConnectingWires = 10;
		System.out.println("Changed Number of Connecting Wires:" + polycrystallinePanel.NoOfConnectingWires);

	}
}