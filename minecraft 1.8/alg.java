/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.ArrayList;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class alg
/*  6:   */   extends alq
/*  7:   */ {
/*  8:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  9:   */   {
/* 10:38 */     if (!paramaqu.D)
/* 11:   */     {
/* 12:39 */       ahm localahm = new ahm(paramaqu, paramdt.n() + paramFloat1, paramdt.o() + paramFloat2, paramdt.p() + paramFloat3, paramamj);
/* 13:40 */       paramaqu.d(localahm);
/* 14:42 */       if (!paramahd.by.d) {
/* 15:43 */         paramamj.b -= 1;
/* 16:   */       }
/* 17:45 */       return true;
/* 18:   */     }
/* 19:48 */     return false;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(amj paramamj, ahd paramahd, List paramList, boolean paramBoolean)
/* 23:   */   {
/* 24:53 */     if (!paramamj.n()) {
/* 25:54 */       return;
/* 26:   */     }
/* 27:56 */     fn localfn1 = paramamj.o().m("Fireworks");
/* 28:57 */     if (localfn1 == null) {
/* 29:58 */       return;
/* 30:   */     }
/* 31:60 */     if (localfn1.b("Flight", 99)) {
/* 32:61 */       paramList.add(fi.a("item.fireworks.flight") + " " + localfn1.d("Flight"));
/* 33:   */     }
/* 34:65 */     fv localfv = localfn1.c("Explosions", 10);
/* 35:66 */     if ((localfv != null) && (localfv.c() > 0)) {
/* 36:67 */       for (int i = 0; i < localfv.c(); i++)
/* 37:   */       {
/* 38:68 */         fn localfn2 = localfv.b(i);
/* 39:   */         
/* 40:70 */         ArrayList localArrayList = Lists.newArrayList();
/* 41:71 */         alf.a(localfn2, localArrayList);
/* 42:73 */         if (localArrayList.size() > 0)
/* 43:   */         {
/* 44:74 */           for (int j = 1; j < localArrayList.size(); j++) {
/* 45:75 */             localArrayList.set(j, "  " + (String)localArrayList.get(j));
/* 46:   */           }
/* 47:78 */           paramList.addAll(localArrayList);
/* 48:   */         }
/* 49:   */       }
/* 50:   */     }
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     alg
 * JD-Core Version:    0.7.0.1
 */