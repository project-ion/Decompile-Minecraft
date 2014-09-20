/*  1:   */ public class zr
/*  2:   */   extends zn
/*  3:   */ {
/*  4:   */   private final aby c;
/*  5:   */   
/*  6:   */   public zr(aby paramaby, double paramDouble)
/*  7:   */   {
/*  8:17 */     super(paramaby, paramDouble, 8);
/*  9:18 */     this.c = paramaby;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean a()
/* 13:   */   {
/* 14:23 */     return (this.c.cj()) && (!this.c.cl()) && (super.a());
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean b()
/* 18:   */   {
/* 19:28 */     return super.b();
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void c()
/* 23:   */   {
/* 24:33 */     super.c();
/* 25:34 */     this.c.cn().a(false);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void d()
/* 29:   */   {
/* 30:39 */     super.d();
/* 31:40 */     this.c.n(false);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void e()
/* 35:   */   {
/* 36:45 */     super.e();
/* 37:   */     
/* 38:47 */     this.c.cn().a(false);
/* 39:48 */     if (!f()) {
/* 40:49 */       this.c.n(false);
/* 41:50 */     } else if (!this.c.cl()) {
/* 42:51 */       this.c.n(true);
/* 43:   */     }
/* 44:   */   }
/* 45:   */   
/* 46:   */   protected boolean a(aqu paramaqu, dt paramdt)
/* 47:   */   {
/* 48:57 */     if (!paramaqu.d(paramdt.a())) {
/* 49:58 */       return false;
/* 50:   */     }
/* 51:61 */     bec localbec = paramaqu.p(paramdt);
/* 52:62 */     atr localatr = localbec.c();
/* 53:64 */     if (localatr == aty.ae)
/* 54:   */     {
/* 55:65 */       bcm localbcm = paramaqu.s(paramdt);
/* 56:66 */       if (((localbcm instanceof bcr)) && (((bcr)localbcm).l < 1)) {
/* 57:67 */         return true;
/* 58:   */       }
/* 59:   */     }
/* 60:   */     else
/* 61:   */     {
/* 62:69 */       if (localatr == aty.am) {
/* 63:70 */         return true;
/* 64:   */       }
/* 65:71 */       if ((localatr == aty.C) && (localbec.b(atp.a) != atq.a)) {
/* 66:72 */         return true;
/* 67:   */       }
/* 68:   */     }
/* 69:75 */     return false;
/* 70:   */   }
/* 71:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     zr
 * JD-Core Version:    0.7.0.1
 */