import java.util.Random;

public class TestNazione {

    public static void main(String[] args){
        String[] listaNazioni = { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua e Barbuda", "Arabia Saudita",
                "Argentina", "Armenia", "Australia", "Austria", "Azerbaigian", "Bahamas", "Bahrein", "Bangladesh",
                "Barbados", "Belgio", "Belize", "Benin", "Bhutan", "Bielorussia", "Birmania (Myanmar)", "Bolivia",
                "Bosnia ed Erzegovina", "Botswana", "Brasile", "Brunei", "Bulgaria", "Burkina Faso", "Burundi",
                "Cambogia", "Camerun", "Canada", "Capo Verde", "Ciad", "Cile", "Cina", "Cipro", "Città del Vaticano",
                "Colombia", "Comore", "Corea del Nord", "Corea del Sud", "Costa d'Avorio", "Costa Rica", "Croazia",
                "Cuba", "Danimarca", "Dominica", "Ecuador", "Egitto", "El Salvador", "Emirati Arabi Uniti", "Eritrea",
                "Estonia", "Etiopia", "Figi", "Filippine", "Finlandia", "Francia", "Gabon", "Gambia", "Georgia",
                "Germania", "Ghana", "Giamaica", "Giappone", "Gibuti", "Giordania", "Grecia", "Grenada", "Guatemala",
                "Guinea", "Guinea-Bissau", "Guinea Equatoriale", "Guyana", "Haiti", "Honduras", "India", "Indonesia",
                "Iran", "Iraq", "Irlanda", "Islanda", "Isole Marshall", "Isole Salomone", "Israele", "Italia",
                "Kazakistan", "Kenya", "Kirghizistan", "Kiribati", "Kuwait", "Laos", "Lesotho", "Lettonia", "Libano",
                "Liberia", "Libia", "Liechtenstein", "Lituania", "Lussemburgo", "Macedonia del Nord", "Madagascar",
                "Malawi", "Malaysia", "Maldive", "Mali", "Malta", "Marocco", "Mauritania", "Mauritius", "Messico",
                "Micronesia", "Moldavia", "Monaco", "Mongolia", "Montenegro", "Mozambico", "Namibia", "Nauru",
                "Nepal", "Nicaragua", "Niger", "Nigeria", "Norvegia", "Nuova Zelanda", "Oman", "Paesi Bassi",
                "Pakistan", "Palau", "Palestina", "Panama", "Papua Nuova Guinea", "Paraguay", "Perù", "Polonia",
                "Portogallo", "Qatar", "Regno Unito", "Repubblica Ceca", "Repubblica Centrafricana", "Repubblica del Congo",
                "Repubblica Democratica del Congo", "Repubblica Dominicana", "Romania", "Ruanda", "Russia",
                "Saint Kitts e Nevis", "Saint Lucia", "Saint Vincent e Grenadine", "Samoa", "San Marino",
                "São Tomé e Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Siria",
                "Slovacchia", "Slovenia", "Somalia", "Spagna", "Sri Lanka", "Stati Uniti", "Sudafrica", "Sudan",
                "Sudan del Sud", "Suriname", "Svezia", "Svizzera", "Swaziland (Eswatini)", "Tagikistan", "Taiwan",
                "Tanzania", "Thailandia", "Timor Est", "Togo", "Tonga", "Trinidad e Tobago", "Tunisia", "Turchia",
                "Turkmenistan", "Tuvalu", "Ucraina", "Uganda", "Ungheria", "Uruguay", "Uzbekistan", "Vanuatu",
                "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"};


        // Test 1 - piuEstesaDi
        System.out.println("Inizio Test 1: ");
        Nazione n1 = new Nazione("Venezuela", 916445, 28000000);
        Nazione n2 = new Nazione("Yemen", 534622, 4000000 );
        System.out.println(n1.piuEstesaDi(n2));
        System.out.println();
        // fine test 1

        // Test 2 - piuPopolosaDi
        System.out.println("Inizio Test 2: ");
        Nazione n3 = new Nazione("Ucraina", 550680, 10000000);
        Nazione n4 = new Nazione("Cina", 12000000, 1500000000);
        System.out.println(n3.piuPopolosaDi(n4));
        System.out.println();
        // fine test 2

        // Test 3 - esisteAlmenoUnaPiuEstesa
        System.out.println("Inizio Test 3: ");
        Nazione[] nazioni1 = new Nazione[30];
        System.out.print("[");
        for(int i = 0; i < 30; i++){
            Random r = new Random();
            int nazione = r.nextInt(listaNazioni.length);
            double superficie = r.nextDouble(100000.0, 17000000.0);
            int abitanti = r.nextInt(500000, 2000000000);
            Nazione n = new Nazione(listaNazioni[nazione],superficie, abitanti);
            nazioni1[i] = n;
            System.out.print("(\"" + listaNazioni[nazione] + "\"," + superficie + "," + abitanti + ")");
        }
        System.out.print("]");
        Nazione n5 = new Nazione("Italia", 302680, 58000000);
        System.out.println();
        System.out.println(n4.esisteAlmenoUnaPiuEstesa(nazioni1));
        System.out.println();
        // fine test 3


        // Test 4 - dimmiQuanteSonoPiuPopolose
        System.out.println("Inizio Test 4:");
        Nazione[] nazioni2 = new Nazione[30];
        System.out.print("[");
        for(int i = 0; i < 30; i++){
            Random r = new Random();
            int nazione = r.nextInt(listaNazioni.length);
            double superficie = r.nextDouble(1000, 17000000);
            int abitanti = r.nextInt(500000, 2000000000);
            Nazione n = new Nazione(listaNazioni[nazione],superficie, abitanti);
            nazioni2[i] = n;
            System.out.print("(\"" + listaNazioni[nazione] + "\"," + superficie + "," + abitanti + ")");
        }
        System.out.print("]");
        Nazione n6 = new Nazione("Giamaica", 2000000, 8000000);
        System.out.println();
        System.out.println(n6.dimmiQuanteSonoPiuPopolose(nazioni2));
        System.out.println();
        // fine test 4

        // test 5 - haPiuAbitantiDiTutteLeAltre
        System.out.println("Inizio Test 5:");
        Nazione[] nazioni3 = new Nazione[30];
        System.out.print("[");
        for(int i = 0; i < 30; i++){
            Random r = new Random();
            int nazione = r.nextInt(listaNazioni.length);
            double superficie = r.nextDouble(1000, 17000000);
            int abitanti = r.nextInt(500000, 2000000000);
            Nazione n = new Nazione(listaNazioni[nazione],superficie, abitanti);
            nazioni3[i] = n;
            System.out.print("(\"" + listaNazioni[nazione] + "\"," + superficie + "," + abitanti + ")");
        }
        System.out.print("]");
        Nazione n7 = new Nazione("Norvegia", 2000000, 1700000000);
        System.out.println();
        System.out.println(n7.haPiuAbitantiDiTutteLeAltre(nazioni3));
        System.out.println();
        // fine test 5

        // Test 6 - hannoTutteLaMiaStessaIniziale
        System.out.println("Inizio Test 6:");
        Nazione[] nazioni4 = new Nazione[10];
        System.out.print("[");
        int j = 0;
        while(j < 10){
            Random r = new Random();
            int nazione = r.nextInt(listaNazioni.length);
            double superficie = r.nextDouble(1000, 17000000);
            int abitanti = r.nextInt(500000, 2000000000);
            Nazione n = new Nazione(listaNazioni[nazione],superficie, abitanti);
            if('C' == n.getDenomizione().charAt(0)) {
                nazioni4[j] = n;
                System.out.print("(\"" + listaNazioni[nazione] + "\"," + superficie + "," + abitanti + ")");
                j++;
            }

        }
        System.out.print("]");
        Nazione n8 = new Nazione("Cile", 34839282, 489234898);
        System.out.println();
        System.out.println(n8.hannoTutteLaMiaStessaIniziale(nazioni4));
        System.out.println();
        // fine test 6

        // Test 7 - eAlDiSopraDellaMediaComeSuperficie
        System.out.println("Inizio Test 7: ");
        Nazione[] nazioni5 = new Nazione[20];
        System.out.print("[");
        for(int i = 0; i < 20; i++){
            Random r = new Random();
            int nazione = r.nextInt(listaNazioni.length);
            double superficie = r.nextDouble(1000, 17_000_000);
            int abitanti = r.nextInt(500000, 2000000000);
            Nazione n = new Nazione(listaNazioni[nazione],superficie, abitanti);
            nazioni5[i] = n;
            System.out.print("(\"" + listaNazioni[nazione] + "\"," + superficie + "," + abitanti + ")");
        }
        System.out.print("]");
        Nazione n9 = new Nazione("Spagna", 15_000_000, 47382938);
        System.out.println();
        System.out.println(n9.eAlDiSopraDellaMediaComeSuperficie(nazioni5));
        System.out.println();

    }




}
