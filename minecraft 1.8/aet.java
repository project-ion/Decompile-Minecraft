/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class aet
/*   4:    */   extends zb
/*   5:    */ {
/*   6:    */   private aer a;
/*   7:    */   
/*   8:    */   public aet(aer paramaer)
/*   9:    */   {
/*  10:449 */     this.a = paramaer;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean a()
/*  14:    */   {
/*  15:454 */     if (!this.a.o.Q().b("mobGriefing")) {
/*  16:455 */       return false;
/*  17:    */     }
/*  18:457 */     if (this.a.ck().c().r() == bof.a) {
/*  19:458 */       return false;
/*  20:    */     }
/*  21:460 */     if (this.a.bb().nextInt(2000) != 0) {
/*  22:461 */       return false;
/*  23:    */     }
/*  24:463 */     return true;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void e()
/*  28:    */   {
/*  29:468 */     Random localRandom = this.a.bb();
/*  30:469 */     aqu localaqu = this.a.o;
/*  31:    */     
/*  32:471 */     int i = uv.c(this.a.s - 1.0D + localRandom.nextDouble() * 2.0D);
/*  33:472 */     int j = uv.c(this.a.t + localRandom.nextDouble() * 2.0D);
/*  34:473 */     int k = uv.c(this.a.u - 1.0D + localRandom.nextDouble() * 2.0D);
/*  35:474 */     dt localdt = new dt(i, j, k);
/*  36:475 */     atr localatr1 = localaqu.p(localdt).c();
/*  37:476 */     atr localatr2 = localaqu.p(localdt.b()).c();
/*  38:478 */     if (a(localaqu, localdt, this.a.ck().c(), localatr1, localatr2))
/*  39:    */     {
/*  40:479 */       localaqu.a(localdt, this.a.ck(), 3);
/*  41:480 */       this.a.a(aty.a.P());
/*  42:    */     }
/*  43:    */   }
/*  44:    */   
/*  45:    */   private boolean a(aqu paramaqu, dt paramdt, atr paramatr1, atr paramatr2, atr paramatr3)
/*  46:    */   {
/*  47:485 */     if (!paramatr1.c(paramaqu, paramdt)) {
/*  48:486 */       return false;
/*  49:    */     }
/*  50:488 */     if (paramatr2.r() != bof.a) {
/*  51:489 */       return false;
/*  52:    */     }
/*  53:491 */     if (paramatr3.r() == bof.a) {
/*  54:492 */       return false;
/*  55:    */     }
/*  56:494 */     if (!paramatr3.d()) {
/*  57:495 */       return false;
/*  58:    */     }
/*  59:497 */     return true;
/*  60:    */   }
/*  61:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aet
 * JD-Core Version:    0.7.0.1
 */