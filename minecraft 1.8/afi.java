/*   1:    */ class afi
/*   2:    */   extends zb
/*   3:    */ {
/*   4:    */   private afg a;
/*   5:    */   private int b;
/*   6:    */   
/*   7:    */   public afi(afg paramafg)
/*   8:    */   {
/*   9:512 */     this.a = paramafg;
/*  10:    */     
/*  11:514 */     a(3);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public boolean a()
/*  15:    */   {
/*  16:519 */     xm localxm = this.a.u();
/*  17:520 */     if ((localxm == null) || (!localxm.ai())) {
/*  18:521 */       return false;
/*  19:    */     }
/*  20:524 */     return true;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean b()
/*  24:    */   {
/*  25:529 */     return (super.b()) && ((this.a.cl()) || (this.a.h(this.a.u()) > 9.0D));
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void c()
/*  29:    */   {
/*  30:534 */     this.b = -10;
/*  31:535 */     this.a.s().n();
/*  32:536 */     this.a.p().a(this.a.u(), 90.0F, 90.0F);
/*  33:    */     
/*  34:    */ 
/*  35:539 */     this.a.ai = true;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void d()
/*  39:    */   {
/*  40:544 */     afg.a(this.a, 0);
/*  41:545 */     this.a.d(null);
/*  42:    */     
/*  43:547 */     afg.a(this.a).f();
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void e()
/*  47:    */   {
/*  48:552 */     xm localxm = this.a.u();
/*  49:    */     
/*  50:554 */     this.a.s().n();
/*  51:555 */     this.a.p().a(localxm, 90.0F, 90.0F);
/*  52:557 */     if (!this.a.t(localxm))
/*  53:    */     {
/*  54:558 */       this.a.d(null);
/*  55:559 */       return;
/*  56:    */     }
/*  57:563 */     this.b += 1;
/*  58:564 */     if (this.b == 0)
/*  59:    */     {
/*  60:566 */       afg.a(this.a, this.a.u().F());
/*  61:567 */       this.a.o.a(this.a, (byte)21);
/*  62:    */     }
/*  63:568 */     else if (this.b >= this.a.ck())
/*  64:    */     {
/*  65:569 */       float f = 1.0F;
/*  66:570 */       if (this.a.o.aa() == vt.d) {
/*  67:571 */         f += 2.0F;
/*  68:    */       }
/*  69:573 */       if (this.a.cl()) {
/*  70:574 */         f += 2.0F;
/*  71:    */       }
/*  72:576 */       localxm.a(wh.b(this.a, this.a), f);
/*  73:577 */       localxm.a(wh.a(this.a), (float)this.a.a(afs.e).e());
/*  74:578 */       this.a.d(null);
/*  75:    */     }
/*  76:579 */     else if ((this.b < 60) || (this.b % 20 != 0)) {}
/*  77:584 */     super.e();
/*  78:    */   }
/*  79:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     afi
 * JD-Core Version:    0.7.0.1
 */