public class T_B_Uchburchak {
    int a,b;
    public float gipotenuza(int a,int b){
        float c;
        c = (float) Math.sqrt(a*a+b*b);
        return c;
    }

    public float gipotenuza(double a, double b){
        float c;
        c = (float) Math.sqrt(a*a+b*b);
        return c;
    }


    public long yuzi(long a,int b){
        long s = a * b / 2;
        return s;
    }
    public long yuzi(long a,long b){
        long s = a * b / 2;
        return s;
    }
    public long yuzi(int a, long b){
        long s = a * b / 2;
        return s;
    }
    public float yuzi(int a,float b){
        float s = (float) (a * b / 2);
        return s;
    }
    public float yuzi(float a, int b){
        float s = (float) (a * b / 2);
        return s;
    }
    public float yuzi(float a,float b){
        float s = (float) (a * b / 2);
        return s;
    }
    public double yuzi(double a,int b){
        double s = (double) (a * b / 2);
        return s;
    }
    public double yuzi(double a,double b){
        double s = (double) (a * b / 2);
        return s;
    }
    public double yuzi(int a,double b){
        double s = (double) (a * b / 2);
        return s;
    }


    public float yuzi(int a,int b){
        float s = (float) (a * b / 2);
        return s;
    }

    public float perimetr(int a,int b){
        float p = a + b + gipotenuza(a,b);
        return p;
    }

    public double perimetr(double a,double b){
        double p = a + b + gipotenuza(a,b);
        return p;
    }

    public void turi(int a, int b){
        if (a == b){
            System.out.println("teng yonli");
        }
        else if (Math.sqrt(a*a+b*b) == gipotenuza(a,b)) {
            System.out.println("pifagor uchburchagi");
        }
    }
}
