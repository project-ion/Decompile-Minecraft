/*   1:    */ import java.util.Random;
/*   2:    */ import java.util.Set;
/*   3:    */ 
/*   4:    */ class aev
/*   5:    */   extends zb
/*   6:    */ {
/*   7:    */   private aer a;
/*   8:    */   
/*   9:    */   public aev(aer paramaer)
/*  10:    */   {
/*  11:505 */     this.a = paramaer;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public boolean a()
/*  15:    */   {
/*  16:510 */     if (!this.a.o.Q().b("mobGriefing")) {
/*  17:511 */       return false;
/*  18:    */     }
/*  19:513 */     if (this.a.ck().c().r() != bof.a) {
/*  20:514 */       return false;
/*  21:    */     }
/*  22:516 */     if (this.a.bb().nextInt(20) != 0) {
/*  23:517 */       return false;
/*  24:    */     }
/*  25:519 */     return true;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void e()
/*  29:    */   {
/*  30:524 */     Random localRandom = this.a.bb();
/*  31:525 */     aqu localaqu = this.a.o;
/*  32:    */     
/*  33:527 */     int i = uv.c(this.a.s - 2.0D + localRandom.nextDouble() * 4.0D);
/*  34:528 */     int j = uv.c(this.a.t + localRandom.nextDouble() * 3.0D);
/*  35:529 */     int k = uv.c(this.a.u - 2.0D + localRandom.nextDouble() * 4.0D);
/*  36:530 */     dt localdt = new dt(i, j, k);
/*  37:531 */     bec localbec = localaqu.p(localdt);
/*  38:532 */     atr localatr = localbec.c();
/*  39:533 */     if (aer.co().contains(localatr))
/*  40:    */     {
/*  41:534 */       this.a.a(localbec);
/*  42:535 */       localaqu.a(localdt, aty.a.P());
/*  43:    */     }
/*  44:    */   }
/*  45:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aev
 * JD-Core Version:    0.7.0.1
 */