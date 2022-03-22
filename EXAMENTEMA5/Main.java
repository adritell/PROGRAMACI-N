package EXAMENTEMA5;

public class Main {
    public static void main(String[] args) {
        Chirigota ch1=new Chirigota("alo","Fernando","Adrian","Mariano","disfraz",5,2);
        Comparsa co1=new Comparsa("España","Rajoy","Gobierno","Zapatero","disfraz","Asdgfg",3);
        Coro c1= new Coro("Cadiz","Andrea","Julio","Xavi","disfraz",3,4,5);
        Cuarteto cu1=new Cuarteto("Andalucia","Klj","Macarena","Raquel","disfraz",9,6);

        Romancero r1=new Romancero("Algodon","Italica","Daddy Yankee","Fut","disfraz","Primavera");

        AgrupacionOficial ao1=new AgrupacionOficial(1,"adrian",22,"bormujos");
        AgrupacionOficial ao2=new AgrupacionOficial(2,"xavier",20,"bormujos");
        AgrupacionOficial ao3=new AgrupacionOficial(3,"jj",19,"castilleja");

        r1.amo_a_escuchar();
        r1.cantar_la_presentacion();
        r1.hacer_tipo();

        ch1.amo_a_escuchar();
        ch1.caminito_del_falla();
        ch1.hacer_tipo();

        co1.caminito_del_falla();
        co1.cantar_la_presentacion();
        co1.hacer_tipo();

        c1.caminito_del_falla();
        c1.cantar_la_presentacion();
        c1.hacer_tipo();

        cu1.amo_a_escuchar();
        cu1.caminito_del_falla();
        cu1.cantar_la_presentacion();

        ao1.insertar_integrante(ao1);
        ao2.insertar_integrante(ao2);
        ao3.insertar_integrante(ao3);

        ao1.eliminar_integrante(ao3);
    }
}
