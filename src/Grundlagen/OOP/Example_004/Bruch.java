package Grundlagen.OOP.Example_004;

public class Bruch {
    private int zähler, nenner;

    public Bruch(int zähler, int nenner) {
        this.zähler = zähler;
        this.nenner = nenner;
    }

    public Bruch(int zähler) {
        this.zähler = zähler;
        this.nenner = 1;
    }

    public int getNenner() {
        return nenner;
    }

    public int getZähler() {
        return zähler;
    }

    public void multi(int n) {
        this.zähler *= n;
    }

    public void multi(Bruch b) {
        this.zähler = this.zähler * b.zähler;
        this.nenner = this.nenner * b.nenner;
    }

    public void div(Bruch b) {
        this.zähler = this.zähler * b.nenner;
        this.nenner = this.nenner * b.zähler;
    }

    @Override
    public String toString() {
        if (nenner != 1) {
            return zähler + "/" + nenner;
        } else {
            return String.valueOf(zähler);
        }
    }

    public int[] getTeiler(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        int[] erg = new int[counter];
        for (int i = 1, j = 0; i <= n; i++) {
            if (n % i == 0) {
                erg[j] = i;
                j++;
            }
        }
        return erg;
    }

    public int[] getGemeinsams(int[] a, int[] b) {
        int size;
        if (a.length < b.length) {
            size = a.length;
        } else {
            size = b.length;
        }
        int[] result = new int[size];

        for (int i = 0; i < a.length; i++) {
            if (exist(a[i], b)) {
                result[i] = a[i];
            }
        }
        return result;

    }

    public boolean exist(int n, int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }

    public int findeGGT(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void kürze() {
        int ggt = findeGGT(this.zähler, this.nenner);
        this.zähler /= ggt;
        this.nenner /= ggt;
    }


}

