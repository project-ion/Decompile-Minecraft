/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.ArrayList;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class aot
/*  6:   */   implements aoo
/*  7:   */ {
/*  8:   */   private final amj a;
/*  9:   */   private final List b;
/* 10:   */   
/* 11:   */   public aot(amj paramamj, List paramList)
/* 12:   */   {
/* 13:16 */     this.a = paramamj;
/* 14:17 */     this.b = paramList;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public amj b()
/* 18:   */   {
/* 19:23 */     return this.a;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public amj[] b(ain paramain)
/* 23:   */   {
/* 24:28 */     amj[] arrayOfamj = new amj[paramain.n_()];
/* 25:30 */     for (int i = 0; i < arrayOfamj.length; i++)
/* 26:   */     {
/* 27:31 */       amj localamj = paramain.a(i);
/* 28:32 */       if ((localamj != null) && (localamj.b().r())) {
/* 29:33 */         arrayOfamj[i] = new amj(localamj.b().q());
/* 30:   */       }
/* 31:   */     }
/* 32:37 */     return arrayOfamj;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public boolean a(ain paramain, aqu paramaqu)
/* 36:   */   {
/* 37:42 */     ArrayList localArrayList = Lists.newArrayList(this.b);
/* 38:44 */     for (int i = 0; i < paramain.h(); i++) {
/* 39:45 */       for (int j = 0; j < paramain.i(); j++)
/* 40:   */       {
/* 41:46 */         amj localamj1 = paramain.c(j, i);
/* 42:48 */         if (localamj1 != null)
/* 43:   */         {
/* 44:49 */           int k = 0;
/* 45:50 */           for (amj localamj2 : localArrayList) {
/* 46:51 */             if ((localamj1.b() == localamj2.b()) && ((localamj2.i() == 32767) || (localamj1.i() == localamj2.i())))
/* 47:   */             {
/* 48:52 */               k = 1;
/* 49:53 */               localArrayList.remove(localamj2);
/* 50:54 */               break;
/* 51:   */             }
/* 52:   */           }
/* 53:57 */           if (k == 0) {
/* 54:58 */             return false;
/* 55:   */           }
/* 56:   */         }
/* 57:   */       }
/* 58:   */     }
/* 59:64 */     return localArrayList.isEmpty();
/* 60:   */   }
/* 61:   */   
/* 62:   */   public amj a(ain paramain)
/* 63:   */   {
/* 64:70 */     return this.a.k();
/* 65:   */   }
/* 66:   */   
/* 67:   */   public int a()
/* 68:   */   {
/* 69:75 */     return this.b.size();
/* 70:   */   }
/* 71:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aot
 * JD-Core Version:    0.7.0.1
 */