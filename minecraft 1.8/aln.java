/*  1:   */ public class aln
/*  2:   */   extends alq
/*  3:   */ {
/*  4:   */   private final Class a;
/*  5:   */   
/*  6:   */   public aln(Class paramClass)
/*  7:   */   {
/*  8:15 */     this.a = paramClass;
/*  9:16 */     a(akf.c);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 13:   */   {
/* 14:21 */     if (paramej == ej.a) {
/* 15:22 */       return false;
/* 16:   */     }
/* 17:24 */     if (paramej == ej.b) {
/* 18:25 */       return false;
/* 19:   */     }
/* 20:28 */     dt localdt = paramdt.a(paramej);
/* 21:30 */     if (!paramahd.a(localdt, paramej, paramamj)) {
/* 22:31 */       return false;
/* 23:   */     }
/* 24:34 */     adj localadj = a(paramaqu, localdt, paramej);
/* 25:35 */     if ((localadj != null) && (localadj.j()))
/* 26:   */     {
/* 27:36 */       if (!paramaqu.D) {
/* 28:37 */         paramaqu.d(localadj);
/* 29:   */       }
/* 30:39 */       paramamj.b -= 1;
/* 31:   */     }
/* 32:41 */     return true;
/* 33:   */   }
/* 34:   */   
/* 35:   */   private adj a(aqu paramaqu, dt paramdt, ej paramej)
/* 36:   */   {
/* 37:45 */     if (this.a == adm.class) {
/* 38:46 */       return new adm(paramaqu, paramdt, paramej);
/* 39:   */     }
/* 40:47 */     if (this.a == adk.class) {
/* 41:48 */       return new adk(paramaqu, paramdt, paramej);
/* 42:   */     }
/* 43:50 */     return null;
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aln
 * JD-Core Version:    0.7.0.1
 */