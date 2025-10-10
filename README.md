# BST_Binary_Search_Traversal_SDNL
Deskripsi
Proyek ini merupakan implementasi struktur data Binary Search Tree (BST) dengan fitur dasar seperti penambahan, pencarian, dan penghapusan node. BST adalah pohon biner yang setiap node-nya memiliki nilai yang lebih besar dari semua nilai di subtree kiri dan lebih kecil dari semua nilai di subtree kanan, sehingga operasi pencarian dapat dilakukan dengan efisien.

Proyek ini dibuat untuk tujuan pembelajaran dan pengembangan teknik struktur data pada mata kuliah atau latihan pemrograman terkait.

Fitur
Insert: Menambahkan node baru ke dalam BST sesuai dengan aturan BST.

Search: Mencari nilai tertentu di dalam BST.

Delete: Menghapus node dari BST dengan handling kasus node daun, node dengan satu anak, dan node dengan dua anak.

Traversal: Mendukung traversal inorder, preorder, dan postorder untuk menampilkan isi BST.

Struktur Proyek
BST.java : Kelas utama yang mengimplementasikan fungsi-fungsi BST.

Node.java : Kelas yang merepresentasikan node pada BST.

Main.java : Contoh penggunaan kelas BST dengan operasi insert, search, dan delete.

Cara Penggunaan
Clone repository ini ke lokal.

Kompilasi dan jalankan file Main.java menggunakan Java compiler.

Modifikasi kode sesuai kebutuhan untuk melakukan operasi pada BST.

Contoh Penggunaan
java
BST tree = new BST();
tree.insert(50);
tree.insert(30);
tree.insert(70);

boolean found = tree.search(30); // true
tree.delete(50);

tree.inorderTraversal(); // Menampilkan isi tree secara inorder
