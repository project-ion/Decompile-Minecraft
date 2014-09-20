/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class yt
/*   5:    */   extends zb
/*   6:    */ {
/*   7:    */   private abq d;
/*   8:    */   aqu a;
/*   9:    */   private abq e;
/*  10:    */   int b;
/*  11:    */   double c;
/*  12:    */   
/*  13:    */   public yt(abq paramabq, double paramDouble)
/*  14:    */   {
/*  15: 26 */     this.d = paramabq;
/*  16: 27 */     this.a = paramabq.o;
/*  17: 28 */     this.c = paramDouble;
/*  18: 29 */     a(3);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public boolean a()
/*  22:    */   {
/*  23: 34 */     if (!this.d.cp()) {
/*  24: 35 */       return false;
/*  25:    */     }
/*  26: 37 */     this.e = f();
/*  27: 38 */     return this.e != null;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public boolean b()
/*  31:    */   {
/*  32: 43 */     return (this.e.ai()) && (this.e.cp()) && (this.b < 60);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void d()
/*  36:    */   {
/*  37: 48 */     this.e = null;
/*  38: 49 */     this.b = 0;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void e()
/*  42:    */   {
/*  43: 54 */     this.d.p().a(this.e, 10.0F, this.d.bP());
/*  44: 55 */     this.d.s().a(this.e, this.c);
/*  45: 56 */     this.b += 1;
/*  46: 57 */     if ((this.b >= 60) && (this.d.h(this.e) < 9.0D)) {
/*  47: 58 */       g();
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   private abq f()
/*  52:    */   {
/*  53: 63 */     float f = 8.0F;
/*  54: 64 */     List localList = this.a.a(this.d.getClass(), this.d.aQ().b(f, f, f));
/*  55: 65 */     double d1 = 1.7976931348623157E+308D;
/*  56: 66 */     Object localObject = null;
/*  57: 67 */     for (abq localabq : localList) {
/*  58: 68 */       if ((this.d.a(localabq)) && (this.d.h(localabq) < d1))
/*  59:    */       {
/*  60: 69 */         localObject = localabq;
/*  61: 70 */         d1 = this.d.h(localabq);
/*  62:    */       }
/*  63:    */     }
/*  64: 73 */     return localObject;
/*  65:    */   }
/*  66:    */   
/*  67:    */   private void g()
/*  68:    */   {
/*  69: 77 */     ws localws = this.d.a(this.e);
/*  70: 78 */     if (localws == null) {
/*  71: 79 */       return;
/*  72:    */     }
/*  73: 82 */     ahd localahd = this.d.co();
/*  74: 83 */     if ((localahd == null) && (this.e.co() != null)) {
/*  75: 84 */       localahd = this.e.co();
/*  76:    */     }
/*  77: 87 */     if (localahd != null)
/*  78:    */     {
/*  79: 88 */       localahd.b(ty.A);
/*  80: 90 */       if ((this.d instanceof abs)) {
/*  81: 91 */         localahd.b(tl.H);
/*  82:    */       }
/*  83:    */     }
/*  84: 95 */     this.d.b(6000);
/*  85: 96 */     this.e.b(6000);
/*  86: 97 */     this.d.cq();
/*  87: 98 */     this.e.cq();
/*  88: 99 */     localws.b(-24000);
/*  89:100 */     localws.b(this.d.s, this.d.t, this.d.u, 0.0F, 0.0F);
/*  90:101 */     this.a.d(localws);
/*  91:    */     
/*  92:103 */     Random localRandom = this.d.bb();
/*  93:104 */     for (int i = 0; i < 7; i++)
/*  94:    */     {
/*  95:105 */       double d1 = localRandom.nextGaussian() * 0.02D;
/*  96:106 */       double d2 = localRandom.nextGaussian() * 0.02D;
/*  97:107 */       double d3 = localRandom.nextGaussian() * 0.02D;
/*  98:108 */       this.a.a(ew.I, this.d.s + localRandom.nextFloat() * this.d.J * 2.0F - this.d.J, this.d.t + 0.5D + localRandom.nextFloat() * this.d.K, this.d.u + localRandom.nextFloat() * this.d.J * 2.0F - this.d.J, d1, d2, d3, new int[0]);
/*  99:    */     }
/* 100:111 */     if (this.a.Q().b("doMobLoot")) {
/* 101:112 */       this.a.d(new xk(this.a, this.d.s, this.d.t, this.d.u, localRandom.nextInt(7) + 1));
/* 102:    */     }
/* 103:    */   }
/* 104:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     yt
 * JD-Core Version:    0.7.0.1
 */