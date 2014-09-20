/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class avq
/*  5:   */   extends atr
/*  6:   */ {
/*  7:22 */   public static final beu a = beu.a("facing", en.a);
/*  8:23 */   public static final bet b = bet.a("eye");
/*  9:   */   
/* 10:   */   public avq()
/* 11:   */   {
/* 12:26 */     super(bof.e);
/* 13:27 */     j(this.L.b().a(a, ej.c).a(b, Boolean.valueOf(false)));
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean c()
/* 17:   */   {
/* 18:32 */     return false;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void h()
/* 22:   */   {
/* 23:37 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, brt parambrt, List paramList, wv paramwv)
/* 27:   */   {
/* 28:42 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
/* 29:43 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/* 30:45 */     if (((Boolean)paramaqu.p(paramdt).b(b)).booleanValue())
/* 31:   */     {
/* 32:46 */       a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
/* 33:47 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/* 34:   */     }
/* 35:49 */     h();
/* 36:   */   }
/* 37:   */   
/* 38:   */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 39:   */   {
/* 40:55 */     return null;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/* 44:   */   {
/* 45:60 */     return P().a(a, paramxm.aO().d()).a(b, Boolean.valueOf(false));
/* 46:   */   }
/* 47:   */   
/* 48:   */   public boolean N()
/* 49:   */   {
/* 50:65 */     return true;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public int l(aqu paramaqu, dt paramdt)
/* 54:   */   {
/* 55:70 */     if (((Boolean)paramaqu.p(paramdt).b(b)).booleanValue()) {
/* 56:71 */       return 15;
/* 57:   */     }
/* 58:74 */     return 0;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public bec a(int paramInt)
/* 62:   */   {
/* 63:79 */     return P().a(b, Boolean.valueOf((paramInt & 0x4) != 0)).a(a, ej.b(paramInt & 0x3));
/* 64:   */   }
/* 65:   */   
/* 66:   */   public int c(bec parambec)
/* 67:   */   {
/* 68:86 */     int i = 0;
/* 69:   */     
/* 70:88 */     i |= ((ej)parambec.b(a)).b();
/* 71:90 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 72:91 */       i |= 0x4;
/* 73:   */     }
/* 74:94 */     return i;
/* 75:   */   }
/* 76:   */   
/* 77:   */   protected bed e()
/* 78:   */   {
/* 79:99 */     return new bed(this, new bex[] { a, b });
/* 80:   */   }
/* 81:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avq
 * JD-Core Version:    0.7.0.1
 */