/*  1:   */ public class ahp
/*  2:   */   extends ahl
/*  3:   */ {
/*  4:   */   public ahp(aqu paramaqu)
/*  5:   */   {
/*  6:14 */     super(paramaqu);
/*  7:15 */     a(0.3125F, 0.3125F);
/*  8:   */   }
/*  9:   */   
/* 10:   */   public ahp(aqu paramaqu, xm paramxm, double paramDouble1, double paramDouble2, double paramDouble3)
/* 11:   */   {
/* 12:19 */     super(paramaqu, paramxm, paramDouble1, paramDouble2, paramDouble3);
/* 13:   */     
/* 14:21 */     a(0.3125F, 0.3125F);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public ahp(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/* 18:   */   {
/* 19:25 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 20:26 */     a(0.3125F, 0.3125F);
/* 21:   */   }
/* 22:   */   
/* 23:   */   protected void a(bru parambru)
/* 24:   */   {
/* 25:31 */     if (!this.o.D)
/* 26:   */     {
/* 27:   */       boolean bool;
/* 28:32 */       if (parambru.d != null)
/* 29:   */       {
/* 30:33 */         bool = parambru.d.a(wh.a(this, this.a), 5.0F);
/* 31:34 */         if (bool)
/* 32:   */         {
/* 33:35 */           a(this.a, parambru.d);
/* 34:36 */           if (!parambru.d.T()) {
/* 35:37 */             parambru.d.e(5);
/* 36:   */           }
/* 37:   */         }
/* 38:   */       }
/* 39:   */       else
/* 40:   */       {
/* 41:41 */         bool = true;
/* 42:42 */         if ((this.a != null) && ((this.a instanceof xn))) {
/* 43:43 */           bool = this.o.Q().b("mobGriefing");
/* 44:   */         }
/* 45:45 */         if (bool)
/* 46:   */         {
/* 47:46 */           dt localdt = parambru.a().a(parambru.b);
/* 48:47 */           if (this.o.d(localdt)) {
/* 49:48 */             this.o.a(localdt, aty.ab.P());
/* 50:   */           }
/* 51:   */         }
/* 52:   */       }
/* 53:52 */       J();
/* 54:   */     }
/* 55:   */   }
/* 56:   */   
/* 57:   */   public boolean ad()
/* 58:   */   {
/* 59:58 */     return false;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public boolean a(wh paramwh, float paramFloat)
/* 63:   */   {
/* 64:63 */     return false;
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ahp
 * JD-Core Version:    0.7.0.1
 */