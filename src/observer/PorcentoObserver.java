package observer;

import java.text.DecimalFormat;

public class PorcentoObserver extends DadosObserver 
{	 
    public PorcentoObserver(DadosSubject dados) 
    {
        super(dados);
    }
 
    @Override
    public void update() 
    {
        int somaDosValores = dadosSubject.getState().valorA + dadosSubject.getState().valorB + dadosSubject.getState().valorC;
        
        DecimalFormat formatador = new DecimalFormat("#.##");
        String porcentagemA = formatador.format((double) dadosSubject.getState().valorA / somaDosValores);
        String porcentagemB = formatador.format((double) dadosSubject.getState().valorB / somaDosValores);
        String porcentagemC = formatador.format((double) dadosSubject.getState().valorC / somaDosValores);
        
        System.out.println("Porcentagem: Valor A: " + porcentagemA + "% Valor B: " + porcentagemB + "% Valor C: " + porcentagemC + "%");
    }
}