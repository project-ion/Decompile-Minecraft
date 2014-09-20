/*   1:    */ class afk
/*   2:    */   extends yn
/*   3:    */ {
/*   4:    */   private afg g;
/*   5:    */   
/*   6:    */   public afk(afg paramafg)
/*   7:    */   {
/*   8:592 */     super(paramafg);
/*   9:593 */     this.g = paramafg;
/*  10:    */   }
/*  11:    */   
/*  12:    */   public void c()
/*  13:    */   {
/*  14:598 */     if ((!this.f) || (this.g.s().m()))
/*  15:    */     {
/*  16:600 */       this.g.j(0.0F);
/*  17:601 */       afg.a(this.g, false);
/*  18:602 */       return;
/*  19:    */     }
/*  20:605 */     double d1 = this.b - this.g.s;
/*  21:606 */     double d2 = this.c - this.g.t;
/*  22:607 */     double d3 = this.d - this.g.u;
/*  23:608 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*  24:609 */     d4 = uv.a(d4);
/*  25:610 */     d2 /= d4;
/*  26:    */     
/*  27:612 */     float f1 = (float)(Math.atan2(d3, d1) * 180.0D / 3.141592741012573D) - 90.0F;
/*  28:    */     
/*  29:614 */     this.g.y = a(this.g.y, f1, 30.0F);
/*  30:615 */     this.g.aG = this.g.y;
/*  31:    */     
/*  32:617 */     float f2 = (float)(this.e * this.g.a(afs.d).e());
/*  33:618 */     this.g.j(this.g.bH() + (f2 - this.g.bH()) * 0.125F);
/*  34:619 */     double d5 = Math.sin((this.g.W + this.g.F()) * 0.5D) * 0.05D;
/*  35:620 */     double d6 = Math.cos(this.g.y * 3.141593F / 180.0F);
/*  36:621 */     double d7 = Math.sin(this.g.y * 3.141593F / 180.0F);
/*  37:622 */     this.g.v += d5 * d6;
/*  38:623 */     this.g.x += d5 * d7;
/*  39:    */     
/*  40:625 */     d5 = Math.sin((this.g.W + this.g.F()) * 0.75D) * 0.05D;
/*  41:626 */     this.g.w += d5 * (d7 + d6) * 0.25D;
/*  42:627 */     this.g.w += this.g.bH() * d2 * 0.1D;
/*  43:    */     
/*  44:629 */     ym localym = this.g.p();
/*  45:630 */     double d8 = this.g.s + d1 / d4 * 2.0D;
/*  46:631 */     double d9 = this.g.aR() + this.g.t + d2 / d4 * 1.0D;
/*  47:632 */     double d10 = this.g.u + d3 / d4 * 2.0D;
/*  48:633 */     double d11 = localym.e();
/*  49:634 */     double d12 = localym.f();
/*  50:635 */     double d13 = localym.g();
/*  51:636 */     if (!localym.b())
/*  52:    */     {
/*  53:637 */       d11 = d8;
/*  54:638 */       d12 = d9;
/*  55:639 */       d13 = d10;
/*  56:    */     }
/*  57:641 */     this.g.p().a(d11 + (d8 - d11) * 0.125D, d12 + (d9 - d12) * 0.125D, d13 + (d10 - d13) * 0.125D, 10.0F, 40.0F);
/*  58:642 */     afg.a(this.g, true);
/*  59:    */   }
/*  60:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     afk
 * JD-Core Version:    0.7.0.1
 */