public class Moneda {
    ConexionAPI consultarValor=new ConexionAPI();
    JSON claseJSON= consultarValor.consultarValorMonedas();

    public void calcularConversion(String OG, String DT, double cant){
        double valorOrigen= claseJSON.conversion_rates().get(OG);
        double valorDestino= claseJSON.conversion_rates().get(DT);
        double valor=(valorDestino/valorOrigen)*cant;
        String totalConvertido= String.format("%.2f",valor);

        System.out.println("LA CANTIDAD DE "+cant+" "+"["+OG +"] = "+totalConvertido+" ["+DT +"]");
    }


}
