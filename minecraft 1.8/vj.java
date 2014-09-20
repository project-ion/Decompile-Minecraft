/*  1:   */ import java.util.Collection;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class vj
/*  5:   */ {
/*  6:   */   public static int a(Collection paramCollection)
/*  7:   */   {
/*  8: 8 */     int i = 0;
/*  9: 9 */     for (vk localvk : paramCollection) {
/* 10:10 */       i += localvk.a;
/* 11:   */     }
/* 12:12 */     return i;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public static vk a(Random paramRandom, Collection paramCollection, int paramInt)
/* 16:   */   {
/* 17:16 */     if (paramInt <= 0) {
/* 18:17 */       throw new IllegalArgumentException();
/* 19:   */     }
/* 20:20 */     int i = paramRandom.nextInt(paramInt);
/* 21:21 */     return a(paramCollection, i);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public static vk a(Collection paramCollection, int paramInt)
/* 25:   */   {
/* 26:25 */     for (vk localvk : paramCollection)
/* 27:   */     {
/* 28:26 */       paramInt -= localvk.a;
/* 29:27 */       if (paramInt < 0) {
/* 30:28 */         return localvk;
/* 31:   */       }
/* 32:   */     }
/* 33:31 */     return null;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public static vk a(Random paramRandom, Collection paramCollection)
/* 37:   */   {
/* 38:35 */     return a(paramRandom, paramCollection, a(paramCollection));
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     vj
 * JD-Core Version:    0.7.0.1
 */