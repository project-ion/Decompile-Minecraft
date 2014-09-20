/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ public class bep
/*  4:   */   implements Predicate
/*  5:   */ {
/*  6:   */   private final atr a;
/*  7:   */   
/*  8:   */   private bep(atr paramatr)
/*  9:   */   {
/* 10:13 */     this.a = paramatr;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public static bep a(atr paramatr)
/* 14:   */   {
/* 15:17 */     return new bep(paramatr);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean a(bec parambec)
/* 19:   */   {
/* 20:23 */     if ((parambec == null) || (parambec.c() != this.a)) {
/* 21:24 */       return false;
/* 22:   */     }
/* 23:26 */     return true;
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bep
 * JD-Core Version:    0.7.0.1
 */