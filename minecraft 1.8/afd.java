/*   1:    */ class afd
/*   2:    */   extends zb
/*   3:    */ {
/*   4:    */   private afa b;
/*   5:    */   public int a;
/*   6:    */   
/*   7:    */   public afd(afa paramafa)
/*   8:    */   {
/*   9:297 */     this.b = paramafa;
/*  10:    */   }
/*  11:    */   
/*  12:    */   public boolean a()
/*  13:    */   {
/*  14:302 */     return this.b.u() != null;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void c()
/*  18:    */   {
/*  19:307 */     this.a = 0;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void d()
/*  23:    */   {
/*  24:312 */     this.b.a(false);
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void e()
/*  28:    */   {
/*  29:317 */     xm localxm = this.b.u();
/*  30:    */     
/*  31:319 */     double d1 = 64.0D;
/*  32:320 */     if ((localxm.h(this.b) < d1 * d1) && (this.b.t(localxm)))
/*  33:    */     {
/*  34:321 */       aqu localaqu = this.b.o;
/*  35:    */       
/*  36:323 */       this.a += 1;
/*  37:324 */       if (this.a == 10) {
/*  38:325 */         localaqu.a(null, 1007, new dt(this.b), 0);
/*  39:    */       }
/*  40:327 */       if (this.a == 20)
/*  41:    */       {
/*  42:328 */         double d2 = 4.0D;
/*  43:329 */         brw localbrw = this.b.d(1.0F);
/*  44:    */         
/*  45:331 */         double d3 = localxm.s - (this.b.s + localbrw.a * d2);
/*  46:332 */         double d4 = localxm.aQ().b + localxm.K / 2.0F - (0.5D + this.b.t + this.b.K / 2.0F);
/*  47:333 */         double d5 = localxm.u - (this.b.u + localbrw.c * d2);
/*  48:    */         
/*  49:335 */         localaqu.a(null, 1008, new dt(this.b), 0);
/*  50:336 */         ahn localahn = new ahn(localaqu, this.b, d3, d4, d5);
/*  51:337 */         localahn.e = this.b.cd();
/*  52:338 */         localahn.s = (this.b.s + localbrw.a * d2);
/*  53:339 */         localahn.t = (this.b.t + this.b.K / 2.0F + 0.5D);
/*  54:340 */         localahn.u = (this.b.u + localbrw.c * d2);
/*  55:341 */         localaqu.d(localahn);
/*  56:342 */         this.a = -40;
/*  57:    */       }
/*  58:    */     }
/*  59:344 */     else if (this.a > 0)
/*  60:    */     {
/*  61:345 */       this.a -= 1;
/*  62:    */     }
/*  63:347 */     this.b.a(this.a > 10);
/*  64:    */   }
/*  65:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     afd
 * JD-Core Version:    0.7.0.1
 */