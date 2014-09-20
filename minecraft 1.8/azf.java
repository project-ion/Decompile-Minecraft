/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class azf
/*  4:   */   extends ath
/*  5:   */ {
/*  6:17 */   public static final bet a = bet.a("powered");
/*  7:   */   private final azh b;
/*  8:   */   
/*  9:   */   protected azf(bof parambof, azh paramazh)
/* 10:   */   {
/* 11:26 */     super(parambof);
/* 12:27 */     j(this.L.b().a(a, Boolean.valueOf(false)));
/* 13:28 */     this.b = paramazh;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected int e(bec parambec)
/* 17:   */   {
/* 18:38 */     return ((Boolean)parambec.b(a)).booleanValue() ? 15 : 0;
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected bec a(bec parambec, int paramInt)
/* 22:   */   {
/* 23:43 */     return parambec.a(a, Boolean.valueOf(paramInt > 0));
/* 24:   */   }
/* 25:   */   
/* 26:   */   protected int e(aqu paramaqu, dt paramdt)
/* 27:   */   {
/* 28:48 */     brt localbrt = a(paramdt);
/* 29:   */     List localList;
/* 30:51 */     switch (azg.a[this.b.ordinal()])
/* 31:   */     {
/* 32:   */     case 1: 
/* 33:53 */       localList = paramaqu.b(null, localbrt);
/* 34:54 */       break;
/* 35:   */     case 2: 
/* 36:56 */       localList = paramaqu.a(xm.class, localbrt);
/* 37:57 */       break;
/* 38:   */     default: 
/* 39:59 */       return 0;
/* 40:   */     }
/* 41:62 */     if (!localList.isEmpty()) {
/* 42:63 */       for (wv localwv : localList) {
/* 43:64 */         if (!localwv.aH()) {
/* 44:65 */           return 15;
/* 45:   */         }
/* 46:   */       }
/* 47:   */     }
/* 48:70 */     return 0;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public bec a(int paramInt)
/* 52:   */   {
/* 53:75 */     return P().a(a, Boolean.valueOf(paramInt == 1));
/* 54:   */   }
/* 55:   */   
/* 56:   */   public int c(bec parambec)
/* 57:   */   {
/* 58:81 */     return ((Boolean)parambec.b(a)).booleanValue() ? 1 : 0;
/* 59:   */   }
/* 60:   */   
/* 61:   */   protected bed e()
/* 62:   */   {
/* 63:86 */     return new bed(this, new bex[] { a });
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     azf
 * JD-Core Version:    0.7.0.1
 */