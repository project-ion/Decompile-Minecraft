/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class alh
/*  4:   */   extends all
/*  5:   */ {
/*  6:   */   private final boolean b;
/*  7:   */   
/*  8:   */   public alh(boolean paramBoolean)
/*  9:   */   {
/* 10:19 */     super(0, 0.0F, false);
/* 11:   */     
/* 12:21 */     this.b = paramBoolean;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int h(amj paramamj)
/* 16:   */   {
/* 17:26 */     ali localali = ali.a(paramamj);
/* 18:28 */     if ((this.b) && (localali.g())) {
/* 19:29 */       return localali.e();
/* 20:   */     }
/* 21:31 */     return localali.c();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public float i(amj paramamj)
/* 25:   */   {
/* 26:37 */     ali localali = ali.a(paramamj);
/* 27:39 */     if ((this.b) && (localali.g())) {
/* 28:40 */       return localali.f();
/* 29:   */     }
/* 30:42 */     return localali.d();
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String j(amj paramamj)
/* 34:   */   {
/* 35:48 */     if (ali.a(paramamj) == ali.d) {
/* 36:49 */       return ans.m;
/* 37:   */     }
/* 38:51 */     return null;
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected void c(amj paramamj, aqu paramaqu, ahd paramahd)
/* 42:   */   {
/* 43:57 */     ali localali = ali.a(paramamj);
/* 44:59 */     if (localali == ali.d)
/* 45:   */     {
/* 46:60 */       paramahd.c(new wq(wp.u.H, 1200, 3));
/* 47:61 */       paramahd.c(new wq(wp.s.H, 300, 2));
/* 48:62 */       paramahd.c(new wq(wp.k.H, 300, 1));
/* 49:   */     }
/* 50:65 */     super.c(paramamj, paramaqu, paramahd);
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void a(alq paramalq, akf paramakf, List paramList)
/* 54:   */   {
/* 55:70 */     for (ali localali : ) {
/* 56:71 */       if ((!this.b) || (localali.g())) {
/* 57:72 */         paramList.add(new amj(this, 1, localali.a()));
/* 58:   */       }
/* 59:   */     }
/* 60:   */   }
/* 61:   */   
/* 62:   */   public String e_(amj paramamj)
/* 63:   */   {
/* 64:79 */     ali localali = ali.a(paramamj);
/* 65:80 */     return a() + "." + localali.b() + "." + ((this.b) && (localali.g()) ? "cooked" : "raw");
/* 66:   */   }
/* 67:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     alh
 * JD-Core Version:    0.7.0.1
 */