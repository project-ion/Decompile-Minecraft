/*   1:    */ public class ahw
/*   2:    */   extends ahl
/*   3:    */ {
/*   4:    */   public ahw(aqu paramaqu)
/*   5:    */   {
/*   6: 21 */     super(paramaqu);
/*   7: 22 */     a(0.3125F, 0.3125F);
/*   8:    */   }
/*   9:    */   
/*  10:    */   public ahw(aqu paramaqu, xm paramxm, double paramDouble1, double paramDouble2, double paramDouble3)
/*  11:    */   {
/*  12: 26 */     super(paramaqu, paramxm, paramDouble1, paramDouble2, paramDouble3);
/*  13:    */     
/*  14: 28 */     a(0.3125F, 0.3125F);
/*  15:    */   }
/*  16:    */   
/*  17:    */   protected float j()
/*  18:    */   {
/*  19: 33 */     return l() ? 0.73F : super.j();
/*  20:    */   }
/*  21:    */   
/*  22:    */   public ahw(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  23:    */   {
/*  24: 37 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*  25: 38 */     a(0.3125F, 0.3125F);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean au()
/*  29:    */   {
/*  30: 43 */     return false;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public float a(aqo paramaqo, aqu paramaqu, dt paramdt, bec parambec)
/*  34:    */   {
/*  35: 48 */     float f = super.a(paramaqo, paramaqu, paramdt, parambec);
/*  36: 50 */     if ((l()) && (parambec.c() != aty.h) && (parambec.c() != aty.bF) && (parambec.c() != aty.bG) && (parambec.c() != aty.bX)) {
/*  37: 51 */       f = Math.min(0.8F, f);
/*  38:    */     }
/*  39: 54 */     return f;
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected void a(bru parambru)
/*  43:    */   {
/*  44: 59 */     if (!this.o.D)
/*  45:    */     {
/*  46: 60 */       if (parambru.d != null)
/*  47:    */       {
/*  48: 61 */         if (this.a != null)
/*  49:    */         {
/*  50: 62 */           if (parambru.d.a(wh.a(this.a), 8.0F)) {
/*  51: 63 */             if (!parambru.d.ai()) {
/*  52: 64 */               this.a.g(5.0F);
/*  53:    */             } else {
/*  54: 66 */               a(this.a, parambru.d);
/*  55:    */             }
/*  56:    */           }
/*  57:    */         }
/*  58:    */         else {
/*  59: 70 */           parambru.d.a(wh.l, 5.0F);
/*  60:    */         }
/*  61: 72 */         if ((parambru.d instanceof xm))
/*  62:    */         {
/*  63: 73 */           int i = 0;
/*  64: 74 */           if (this.o.aa() == vt.c) {
/*  65: 75 */             i = 10;
/*  66: 76 */           } else if (this.o.aa() == vt.d) {
/*  67: 77 */             i = 40;
/*  68:    */           }
/*  69: 79 */           if (i > 0) {
/*  70: 80 */             ((xm)parambru.d).c(new wq(wp.v.H, 20 * i, 1));
/*  71:    */           }
/*  72:    */         }
/*  73:    */       }
/*  74: 84 */       this.o.a(this, this.s, this.t, this.u, 1.0F, false, this.o.Q().b("mobGriefing"));
/*  75: 85 */       J();
/*  76:    */     }
/*  77:    */   }
/*  78:    */   
/*  79:    */   public boolean ad()
/*  80:    */   {
/*  81: 91 */     return false;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public boolean a(wh paramwh, float paramFloat)
/*  85:    */   {
/*  86: 96 */     return false;
/*  87:    */   }
/*  88:    */   
/*  89:    */   protected void h()
/*  90:    */   {
/*  91:101 */     this.ac.a(10, Byte.valueOf((byte)0));
/*  92:    */   }
/*  93:    */   
/*  94:    */   public boolean l()
/*  95:    */   {
/*  96:105 */     return this.ac.a(10) == 1;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void a(boolean paramBoolean)
/* 100:    */   {
/* 101:109 */     this.ac.b(10, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 102:    */   }
/* 103:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ahw
 * JD-Core Version:    0.7.0.1
 */