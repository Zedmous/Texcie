
package generales;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
public class MFecha {
    
    //fecha europea
    public String getFechaeuropea() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        return formateador.format(ahora);
    }
    //Fecha latina
    public String getFechalatina() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }
    //Hora AM PM
    public String getTiempohms() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        return formateador.format(ahora);
    }
    //Hora Militar
    public String getTiempoHms() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("HH:mm:ss");
        return formateador.format(ahora);
    }
    //Solo la hora
    public String getTiempoH() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("HH");
        return formateador.format(ahora);
    }
    //@return Retorna la fecha en formato Date
    public synchronized java.util.Date deStringToDate(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaEnviar = null;
        try {
            fechaEnviar = formatoDelTexto.parse(fecha);
            return fechaEnviar;
        } catch (ParseException ex) {
            return null;
        }
    }
    //@return Retorna la fecha en formato String
    public String deDateToString(Date fecha) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        return df.format(fecha);
    }
    
    
    public Date sumarFechasDias(java.util.Date fch, int dias) {
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fch.getTime());
        cal.add(Calendar.DATE, dias);
        return new java.util.Date(cal.getTimeInMillis());
        //return 
    }

    public Date restarFechasDias(java.util.Date fch, int dias) {
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fch.getTime());
        cal.add(Calendar.DATE, -dias);
        return new java.util.Date(cal.getTimeInMillis());
    }

    public synchronized int diferenciasDeFechas(Date fechaInicial, Date fechaFinal) {

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }

        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal = df.parse(fechaFinalString);
        } catch (ParseException ex) {
            
        }

        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;
        double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
        return ((int) dias);
    }
    public synchronized boolean menorigualfechaactual(Date fechaInicial, Date fechaFinal) {
	boolean validar=false;
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }

        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal = df.parse(fechaFinalString);
        } catch (ParseException ex) {
        }

        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
	if(fechaInicialMs<=fechaFinalMs){
		validar=false;
	}else{
		validar=true;
	}
	return validar;
    }
    public synchronized boolean menorfechaactual(Date fechaInicial, Date fechaFinal) {
	boolean validar=false;
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }

        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal = df.parse(fechaFinalString);
        } catch (ParseException ex) {
        }

        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
	if(fechaInicialMs<fechaFinalMs){
		validar=false;
	}else{
		validar=true;
	}
	return validar;
    }
    //Devuele un java.util.Date desde un String en formato dd-MM-yyyy
    //@param La fecha a convertir a formato date
    
    public String fecharestardias(int dias){
        String fechan="";
        Date fechaActual = Calendar.getInstance().getTime();
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fechaActual.getTime());
        cal.add(Calendar.DATE, dias);
        int mes=cal.get(Calendar.MONTH)+1;
        fechan=String.valueOf(cal.get(Calendar.YEAR))+"-"+String.valueOf(mes)+"-"+String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        return fechan;
    }
    public String fechasumardias(int dias){
        String fechan="";
        Date fechaActual = Calendar.getInstance().getTime();
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fechaActual.getTime());
        cal.add(Calendar.DATE, dias);
        int mes=cal.get(Calendar.MONTH)+1;
        fechan=String.valueOf(cal.get(Calendar.YEAR))+"-"+String.valueOf(mes)+"-"+String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        return fechan;
    }
    //@para validar fecha
    public static boolean isFechaValida(String fechax) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(fechax);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    public static boolean isHora(String fechax) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("hh:mm:ss", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(fechax);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    public String cfecha(String fecha){
        String fechac="",ano="",mes="",dia="";
        String a = fecha.substring(7,8);
        String b = fecha.substring(6,7);
        int log= fecha.length();
        if(a.equalsIgnoreCase("-") && log==10){
            dia= fecha.substring(8,10);
            mes= fecha.substring(5,7);
            ano= fecha.substring(0,4);
        }
        if(a.equalsIgnoreCase("-") && log==9){
            dia= fecha.substring(8,9);
            mes= fecha.substring(5,7);
            ano= fecha.substring(0,4);
        }
        if(b.equalsIgnoreCase("-") && log==8){
            dia= fecha.substring(7,8);
            mes= fecha.substring(5,6);
            ano= fecha.substring(0,4);
        }
        if(b.equalsIgnoreCase("-") && log==9){
            dia= fecha.substring(7,9);
            mes= fecha.substring(5,6);
            ano= fecha.substring(0,4);
        }
        
        fechac=dia+"-"+mes+"-"+ano;
        return fechac;
    }
    public String rfecha(String fecha){
        String fechac="",ano="",mes="",dia="";
        String aux = fecha.substring(1,2);
        String aux2 = fecha.substring(2,3);
        String aux3 = fecha.substring(3,4);
        String aux4 = fecha.substring(4,5);
        String aux5 = fecha.substring(5,6);
        
        
        if(aux2.equalsIgnoreCase("-") && aux5.equalsIgnoreCase("-")){
            dia= fecha.substring(0,2);
            mes= fecha.substring(3,5);
            ano= fecha.substring(6,10);
        }
        if(aux.equalsIgnoreCase("-") && aux3.equalsIgnoreCase("-")){
            dia= fecha.substring(0,1);
            mes= fecha.substring(2,3);
            ano= fecha.substring(4,8);
        }
        if(aux.equalsIgnoreCase("-") && aux4.equalsIgnoreCase("-")){
            dia= fecha.substring(0,1);
            mes= fecha.substring(2,4);
            ano= fecha.substring(5,9);
        }
        if(aux2.equalsIgnoreCase("-") && aux4.equalsIgnoreCase("-")){
            dia= fecha.substring(0,2);
            mes= fecha.substring(3,4);
            ano= fecha.substring(5,9);
        }
        fechac=ano+"-"+mes+"-"+dia;
        return fechac;
    }
    /*public String fechasystemr(){
        Calendar can = new GregorianCalendar();
        return Integer.toString(can.get(Calendar.YEAR))+"-"+Integer.toString(can.get(Calendar.MONTH)+1)+"-"+Integer.toString(can.get(Calendar.DATE));
    }
    public String fechasystemm(){
        Calendar can = new GregorianCalendar();
        return Integer.toString(can.get(Calendar.DATE))+"-"+Integer.toString(can.get(Calendar.MONTH)+1)+"-"+Integer.toString(can.get(Calendar.YEAR));
    }
    public String hora(){
        Calendar can = new GregorianCalendar();
        return Integer.toString(can.get(Calendar.HOUR))+":"+Integer.toString(can.get(Calendar.MINUTE))+":"+Integer.toString(can.get(Calendar.SECOND));
    }*/
    
}
