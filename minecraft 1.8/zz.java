/*  1:   */ public class zz
/*  2:   */   extends zb
/*  3:   */ {
/*  4:   */   private final xn a;
/*  5:   */   private final afr b;
/*  6:   */   private xm c;
/*  7:13 */   private int d = -1;
/*  8:   */   private double e;
/*  9:   */   private int f;
/* 10:   */   private int g;
/* 11:   */   private int h;
/* 12:   */   private float i;
/* 13:   */   private float j;
/* 14:   */   
/* 15:   */   public zz(afr paramafr, double paramDouble, int paramInt, float paramFloat)
/* 16:   */   {
/* 17:22 */     this(paramafr, paramDouble, paramInt, paramInt, paramFloat);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public zz(afr paramafr, double paramDouble, int paramInt1, int paramInt2, float paramFloat)
/* 21:   */   {
/* 22:26 */     if (!(paramafr instanceof xm)) {
/* 23:27 */       throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
/* 24:   */     }
/* 25:29 */     this.b = paramafr;
/* 26:30 */     this.a = ((xn)paramafr);
/* 27:31 */     this.e = paramDouble;
/* 28:32 */     this.g = paramInt1;
/* 29:33 */     this.h = paramInt2;
/* 30:34 */     this.i = paramFloat;
/* 31:35 */     this.j = (paramFloat * paramFloat);
/* 32:36 */     a(3);
/* 33:   */   }
/* 34:   */   
/* 35:   */   public boolean a()
/* 36:   */   {
/* 37:41 */     xm localxm = this.a.u();
/* 38:42 */     if (localxm == null) {
/* 39:43 */       return false;
/* 40:   */     }
/* 41:45 */     this.c = localxm;
/* 42:46 */     return true;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public boolean b()
/* 46:   */   {
/* 47:51 */     return (a()) || (!this.a.s().m());
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void d()
/* 51:   */   {
/* 52:56 */     this.c = null;
/* 53:57 */     this.f = 0;
/* 54:58 */     this.d = -1;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void e()
/* 58:   */   {
/* 59:63 */     double d1 = this.a.e(this.c.s, this.c.aQ().b, this.c.u);
/* 60:64 */     boolean bool = this.a.t().a(this.c);
/* 61:66 */     if (bool) {
/* 62:67 */       this.f += 1;
/* 63:   */     } else {
/* 64:69 */       this.f = 0;
/* 65:   */     }
/* 66:72 */     if ((d1 > this.j) || (this.f < 20)) {
/* 67:73 */       this.a.s().a(this.c, this.e);
/* 68:   */     } else {
/* 69:75 */       this.a.s().n();
/* 70:   */     }
/* 71:78 */     this.a.p().a(this.c, 30.0F, 30.0F);
/* 72:   */     float f1;
/* 73:80 */     if (--this.d == 0)
/* 74:   */     {
/* 75:81 */       if ((d1 > this.j) || (!bool)) {
/* 76:82 */         return;
/* 77:   */       }
/* 78:85 */       f1 = uv.a(d1) / this.i;
/* 79:86 */       float f2 = f1;
/* 80:87 */       f2 = uv.a(f2, 0.1F, 1.0F);
/* 81:   */       
/* 82:89 */       this.b.a(this.c, f2);
/* 83:90 */       this.d = uv.d(f1 * (this.h - this.g) + this.g);
/* 84:   */     }
/* 85:91 */     else if (this.d < 0)
/* 86:   */     {
/* 87:92 */       f1 = uv.a(d1) / this.i;
/* 88:93 */       this.d = uv.d(f1 * (this.h - this.g) + this.g);
/* 89:   */     }
/* 90:   */   }
/* 91:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     zz
 * JD-Core Version:    0.7.0.1
 */