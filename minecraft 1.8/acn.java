/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class acn
/*   4:    */   extends abw
/*   5:    */   implements afr
/*   6:    */ {
/*   7:    */   public acn(aqu paramaqu)
/*   8:    */   {
/*   9: 28 */     super(paramaqu);
/*  10: 29 */     a(0.7F, 1.9F);
/*  11:    */     
/*  12: 31 */     ((aay)s()).a(true);
/*  13: 32 */     this.i.a(1, new zz(this, 1.25D, 20, 10.0F));
/*  14: 33 */     this.i.a(2, new zy(this, 1.0D));
/*  15: 34 */     this.i.a(3, new zh(this, ahd.class, 6.0F));
/*  16: 35 */     this.i.a(4, new zx(this));
/*  17:    */     
/*  18: 37 */     this.bg.a(1, new aaq(this, xn.class, 10, true, false, aex.d));
/*  19:    */   }
/*  20:    */   
/*  21:    */   protected void aW()
/*  22:    */   {
/*  23: 42 */     super.aW();
/*  24:    */     
/*  25: 44 */     a(afs.a).a(4.0D);
/*  26: 45 */     a(afs.d).a(0.2000000029802322D);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public void m()
/*  30:    */   {
/*  31: 50 */     super.m();
/*  32: 52 */     if (!this.o.D)
/*  33:    */     {
/*  34: 53 */       int i = uv.c(this.s);
/*  35: 54 */       int j = uv.c(this.t);
/*  36: 55 */       int k = uv.c(this.u);
/*  37: 57 */       if (U()) {
/*  38: 58 */         a(wh.f, 1.0F);
/*  39:    */       }
/*  40: 61 */       if (this.o.b(new dt(i, 0, k)).a(new dt(i, j, k)) > 1.0F) {
/*  41: 62 */         a(wh.c, 1.0F);
/*  42:    */       }
/*  43: 65 */       for (int m = 0; m < 4; m++)
/*  44:    */       {
/*  45: 66 */         i = uv.c(this.s + (m % 2 * 2 - 1) * 0.25F);
/*  46: 67 */         j = uv.c(this.t);
/*  47: 68 */         k = uv.c(this.u + (m / 2 % 2 * 2 - 1) * 0.25F);
/*  48: 69 */         if ((this.o.p(new dt(i, j, k)).c().r() == bof.a) && 
/*  49: 70 */           (this.o.b(new dt(i, 0, k)).a(new dt(i, j, k)) < 0.8F) && 
/*  50: 71 */           (aty.aH.c(this.o, new dt(i, j, k)))) {
/*  51: 72 */           this.o.a(new dt(i, j, k), aty.aH.P());
/*  52:    */         }
/*  53:    */       }
/*  54:    */     }
/*  55:    */   }
/*  56:    */   
/*  57:    */   protected alq A()
/*  58:    */   {
/*  59: 82 */     return amk.aD;
/*  60:    */   }
/*  61:    */   
/*  62:    */   protected void b(boolean paramBoolean, int paramInt)
/*  63:    */   {
/*  64: 88 */     int i = this.V.nextInt(16);
/*  65: 89 */     for (int j = 0; j < i; j++) {
/*  66: 90 */       a(amk.aD, 1);
/*  67:    */     }
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void a(xm paramxm, float paramFloat)
/*  71:    */   {
/*  72: 96 */     ahq localahq = new ahq(this.o, this);
/*  73: 97 */     double d1 = paramxm.t + paramxm.aR() - 1.100000023841858D;
/*  74: 98 */     double d2 = paramxm.s - this.s;
/*  75: 99 */     double d3 = d1 - localahq.t;
/*  76:100 */     double d4 = paramxm.u - this.u;
/*  77:101 */     float f = uv.a(d2 * d2 + d4 * d4) * 0.2F;
/*  78:102 */     localahq.c(d2, d3 + f, d4, 1.6F, 12.0F);
/*  79:    */     
/*  80:104 */     a("random.bow", 1.0F, 1.0F / (bb().nextFloat() * 0.4F + 0.8F));
/*  81:105 */     this.o.d(localahq);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public float aR()
/*  85:    */   {
/*  86:110 */     return 1.7F;
/*  87:    */   }
/*  88:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     acn
 * JD-Core Version:    0.7.0.1
 */