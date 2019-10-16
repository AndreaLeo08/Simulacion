
package proyectopruebacorrida;

public class ctrCorridas {
    csCorrida modelo;
    Double cadena[];
    public ctrCorridas(csCorrida modelo) {
        this.modelo = modelo;
    }
    
    public void corrida(){
        texto t = new texto();
        Double []cadena;
        cadena = t.ObtenerTexto();
        this.cadena = cadena;
        int []corridas = new int[cadena.length-1];
        
        for(int i=1;i<cadena.length;i++){
            if(cadena[i]<cadena[i-1]){
                corridas[i-1]=0;
            }else{
                corridas[i-1]=1;
            }
        }
        //inicia calculo de numero de corridas
        int totCor=0;
        for(int i=1;i<corridas.length;i++){
            
            if(corridas[i]== corridas[i-1]){
            }else{
                totCor++;
            }
        }
         totCor++;
         modelo.setNumcorridas(totCor);
        System.out.println("numero de corridas: "+ totCor);
        //finaliza calculo de numero de corridas
        
        String corr="";
        String corrid ="";
        for(int i=0;i<corridas.length;i++){
            System.out.print(corridas[i]);
           corr = Integer.toString(corridas[i]);
           corrid+=corr;
        }
        modelo.setCorridas(corrid);
        
        
    }
    
    public void valorEsperado(){
        double uco;
        uco = ((2*this.cadena.length)-1)/3;
        System.out.println("valor esperado "+this.cadena.length);
        modelo.setUco(uco);
    }
    public void varianza(){
        double varian,varianz;
        varian = (16*this.cadena.length)-29;
        varianz = varian/90;
        System.out.println("varianza "+varianz);
        modelo.setVarianza(varianz);
        
    }
    public void zo(){
        double zo;
        double raiz = Math.sqrt(modelo.getVarianza());
        zo = (modelo.getNumcorridas()-modelo.getUco())/raiz;
        modelo.setZo(zo);
    }
    public void conclusion(){
        String conc="";
        if(modelo.getZo()<modelo.getZ()){
            conc = "El conjunto ri es independiente";
            modelo.setConclusion(conc);
        }else{
            conc = "El conjunto ri no es independiente";
            modelo.setConclusion(conc);
        }
    }   
}
