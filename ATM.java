public class ATM{
 public int countBanknotes(int sum){
  int[] bills = {500, 200, 100, 50, 20, 10, 5, 2, 1};
  int denomination = 0;
  while (sum >= 500){
   denomination++;
   sum -= 500;
  }
  while (sum >= 200){
   denomination++;
   sum -= 200;
  }
  while (sum >= 100){
   denomination++;
   sum -= 100;
  }
  while (sum >= 50){
   denomination++;
   sum -= 50;
  }
  while (sum >= 20){
   denomination++;
   sum -= 20;
  }
  while (sum >= 10){
   denomination++;
   sum -= 10;
  }
  while (sum >= 5){
   denomination++;
   sum -= 5;
  }
  while (sum >= 2){
   denomination++;
   sum -= 2;
  }
  while (sum >= 1){
   denomination++;
   sum -= 1;
  }
  return denomination++;
 }
}
