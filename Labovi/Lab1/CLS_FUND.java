    public class CLS_FUND {
        
        //Atributi
        private String userName;
        private int id;
        private static int cntID = 100;

        //Konstruktor
        public CLS_FUND(String userName) {
            this.userName = userName;
            this.id = cntID;
            cntID++;
        }

        //Override
        @Override
        public String toString() {
            return "[ CLS_FUND | userName=" + userName + ", id=" + id + " ]";
        }
        
        //Name Setter
            public void setName(String nm) {
            userName = nm;
        }


        //Metode na nivou klase
        public static void clsData() {
            System.out.println("Cnt id is: " + cntID);
        }

        public static boolean checkEquality(Object obj1, Object obj2) {
            if (obj1.equals(obj2)) return true;
            else return false;
        }
    }
