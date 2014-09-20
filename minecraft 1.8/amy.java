/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.List;
/*  3:   */ import java.util.Map;
/*  4:   */ 
/*  5:   */ public class amy
/*  6:   */   extends alq
/*  7:   */ {
/*  8:18 */   private static final Map b = ;
/*  9:   */   public final String a;
/* 10:   */   
/* 11:   */   protected amy(String paramString)
/* 12:   */   {
/* 13:23 */     this.a = paramString;
/* 14:24 */     this.h = 1;
/* 15:25 */     a(akf.f);
/* 16:   */     
/* 17:27 */     b.put("records." + paramString, this);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 21:   */   {
/* 22:32 */     bec localbec = paramaqu.p(paramdt);
/* 23:33 */     if ((localbec.c() == aty.aN) && (!((Boolean)localbec.b(axc.a)).booleanValue()))
/* 24:   */     {
/* 25:34 */       if (paramaqu.D) {
/* 26:35 */         return true;
/* 27:   */       }
/* 28:38 */       ((axc)aty.aN).a(paramaqu, paramdt, localbec, paramamj);
/* 29:39 */       paramaqu.a(null, 1005, paramdt, alq.b(this));
/* 30:40 */       paramamj.b -= 1;
/* 31:41 */       return true;
/* 32:   */     }
/* 33:43 */     return false;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a(amj paramamj, ahd paramahd, List paramList, boolean paramBoolean)
/* 37:   */   {
/* 38:48 */     paramList.add(g());
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String g()
/* 42:   */   {
/* 43:52 */     return fi.a("item.record." + this.a + ".desc");
/* 44:   */   }
/* 45:   */   
/* 46:   */   public amx g(amj paramamj)
/* 47:   */   {
/* 48:57 */     return amx.c;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public static amy b(String paramString)
/* 52:   */   {
/* 53:61 */     return (amy)b.get(paramString);
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     amy
 * JD-Core Version:    0.7.0.1
 */