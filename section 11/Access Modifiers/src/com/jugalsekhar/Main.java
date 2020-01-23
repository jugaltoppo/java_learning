package com.jugalsekhar;

 class Main {

    public static void main(String[] args) {
	Account jugal = new Account("jugal");
	jugal.deposit(1000);
	jugal.withdrawal(10);
	jugal.withdrawal(-20);
	jugal.deposit(-400);
//		jugal.balance=2000;
//		jugal.transactions.add(1010);
	jugal.calculateBalance();
	System.out.println("balance on jugals account is " + jugal.getBalance());
    }
}
