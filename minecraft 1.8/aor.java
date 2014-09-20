/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.ArrayList;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class aor
/*  6:   */   implements aoo
/*  7:   */ {
/*  8:   */   public boolean a(ain paramain, aqu paramaqu)
/*  9:   */   {
/* 10:15 */     ArrayList localArrayList = Lists.newArrayList();
/* 11:17 */     for (int i = 0; i < paramain.n_(); i++)
/* 12:   */     {
/* 13:18 */       amj localamj1 = paramain.a(i);
/* 14:20 */       if (localamj1 != null)
/* 15:   */       {
/* 16:21 */         localArrayList.add(localamj1);
/* 17:23 */         if (localArrayList.size() > 1)
/* 18:   */         {
/* 19:24 */           amj localamj2 = (amj)localArrayList.get(0);
/* 20:25 */           if ((localamj1.b() != localamj2.b()) || (localamj2.b != 1) || (localamj1.b != 1) || (!localamj2.b().m())) {
/* 21:26 */             return false;
/* 22:   */           }
/* 23:   */         }
/* 24:   */       }
/* 25:   */     }
/* 26:32 */     return localArrayList.size() == 2;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public amj a(ain paramain)
/* 30:   */   {
/* 31:38 */     ArrayList localArrayList = Lists.newArrayList();
/* 32:   */     amj localamj2;
/* 33:   */     Object localObject;
/* 34:40 */     for (int i = 0; i < paramain.n_(); i++)
/* 35:   */     {
/* 36:41 */       localamj2 = paramain.a(i);
/* 37:43 */       if (localamj2 != null)
/* 38:   */       {
/* 39:44 */         localArrayList.add(localamj2);
/* 40:46 */         if (localArrayList.size() > 1)
/* 41:   */         {
/* 42:47 */           localObject = (amj)localArrayList.get(0);
/* 43:48 */           if ((localamj2.b() != ((amj)localObject).b()) || (((amj)localObject).b != 1) || (localamj2.b != 1) || (!((amj)localObject).b().m())) {
/* 44:49 */             return null;
/* 45:   */           }
/* 46:   */         }
/* 47:   */       }
/* 48:   */     }
/* 49:55 */     if (localArrayList.size() == 2)
/* 50:   */     {
/* 51:56 */       amj localamj1 = (amj)localArrayList.get(0);
/* 52:57 */       localamj2 = (amj)localArrayList.get(1);
/* 53:59 */       if ((localamj1.b() == localamj2.b()) && (localamj1.b == 1) && (localamj2.b == 1) && (localamj1.b().m()))
/* 54:   */       {
/* 55:60 */         localObject = localamj1.b();
/* 56:61 */         int j = ((alq)localObject).l() - localamj1.h();
/* 57:62 */         int k = ((alq)localObject).l() - localamj2.h();
/* 58:63 */         int m = j + k + ((alq)localObject).l() * 5 / 100;
/* 59:64 */         int n = ((alq)localObject).l() - m;
/* 60:65 */         if (n < 0) {
/* 61:66 */           n = 0;
/* 62:   */         }
/* 63:68 */         return new amj(localamj1.b(), 1, n);
/* 64:   */       }
/* 65:   */     }
/* 66:72 */     return null;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public int a()
/* 70:   */   {
/* 71:77 */     return 4;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public amj b()
/* 75:   */   {
/* 76:83 */     return null;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public amj[] b(ain paramain)
/* 80:   */   {
/* 81:88 */     amj[] arrayOfamj = new amj[paramain.n_()];
/* 82:90 */     for (int i = 0; i < arrayOfamj.length; i++)
/* 83:   */     {
/* 84:91 */       amj localamj = paramain.a(i);
/* 85:92 */       if ((localamj != null) && (localamj.b().r())) {
/* 86:93 */         arrayOfamj[i] = new amj(localamj.b().q());
/* 87:   */       }
/* 88:   */     }
/* 89:97 */     return arrayOfamj;
/* 90:   */   }
/* 91:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aor
 * JD-Core Version:    0.7.0.1
 */