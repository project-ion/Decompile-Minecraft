/*  1:   */ public class czq
/*  2:   */   extends czs
/*  3:   */ {
/*  4:   */   public czq(xm paramxm1, xm paramxm2)
/*  5:   */   {
/*  6: 9 */     super("player_combat");
/*  7:   */     
/*  8:11 */     a("player", paramxm1.d_());
/*  9:12 */     if (paramxm2 != null) {
/* 10:13 */       a("primary_opponent", paramxm2.d_());
/* 11:   */     }
/* 12:16 */     if (paramxm2 != null) {
/* 13:17 */       a("Combat between " + paramxm1.d_() + " and " + paramxm2.d_());
/* 14:   */     } else {
/* 15:19 */       a("Combat between " + paramxm1.d_() + " and others");
/* 16:   */     }
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     czq
 * JD-Core Version:    0.7.0.1
 */