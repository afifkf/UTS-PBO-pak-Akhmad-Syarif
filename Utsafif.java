package utsafif;

public class Utsafif {

    class Pegawai {
        String nama;
        String jabatan;

        Pegawai(String nama, String jabatan) {
            this.nama = nama;
            this.jabatan = jabatan;
        }

        void setNama(String nama) {
            this.nama = nama;
        }

        void setJabatan(String jabatan) {
            this.jabatan = jabatan;
        }
    }

    class Absensi {
        String status;

        Absensi(int jamMasuk) {
            if (jamMasuk < 8) {
                status = "Telat";
            } else {
                status = "Tepat waktu";
            }
        }

        void setStatus(String status) {
            this.status = status;
        }
    }

    class TodoList {
        String[] list = new String[5];
        boolean[] done = new boolean[5];

        TodoList() {
            list[0] = "belajar html";
            list[1] = "belajar css";
            list[2] = "belajar javascript";
            list[3] = "belajar php";
            list[4] = "belajar sql";
        }

        void checkList(int[] checkedList) {
            for (int i = 0; i < checkedList.length; i++) {
                if (checkedList[i] >= 0 && checkedList[i] < 5) {
                    done[checkedList[i]] = true;
                }
            }
        }

        void printList() {
            System.out.println("Daftar todolist:");
            for (int i = 0; i < list.length; i++) {
                System.out.print((i+1) + ".\t" + list[i]);
                if (done[i]) {
                    System.out.println(" (selesai)");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Utsafif program = new Utsafif();
        Pegawai pegawai = program.new Pegawai("Bekantan", "CEO");
        System.out.println("Nama pegawai: " + pegawai.nama);
        System.out.println("Jabatan: " + pegawai.jabatan);

        Absensi absensi = program.new Absensi(8);
        System.out.println(pegawai.nama + " masuk pada jam 08.00 (" + absensi.status + ")");
        absensi.setStatus("Telat");

        TodoList todoList = program.new TodoList();
        int[] checkedList = {0, 2};
        todoList.checkList(checkedList);
        todoList.printList();

        // Reset attribute values
        pegawai.setNama("");
        pegawai.setJabatan("");
        absensi.setStatus("");
        for (int i = 0; i < todoList.done.length; i++) {
            todoList.done[i] = false;
        }
    }
}
    

