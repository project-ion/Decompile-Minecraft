/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ import java.util.Map.Entry;
/*  4:   */ 
/*  5:   */ public class is
/*  6:   */   implements id
/*  7:   */ {
/*  8:   */   private Map a;
/*  9:   */   
/* 10:   */   public is() {}
/* 11:   */   
/* 12:   */   public is(Map paramMap)
/* 13:   */   {
/* 14:20 */     this.a = paramMap;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(ik paramik)
/* 18:   */   {
/* 19:25 */     paramik.a(this);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(hd paramhd)
/* 23:   */   {
/* 24:30 */     int i = paramhd.e();
/* 25:31 */     this.a = Maps.newHashMap();
/* 26:33 */     for (int j = 0; j < i; j++)
/* 27:   */     {
/* 28:34 */       tq localtq = ty.a(paramhd.c(32767));
/* 29:35 */       int k = paramhd.e();
/* 30:37 */       if (localtq != null) {
/* 31:38 */         this.a.put(localtq, Integer.valueOf(k));
/* 32:   */       }
/* 33:   */     }
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void b(hd paramhd)
/* 37:   */   {
/* 38:45 */     paramhd.b(this.a.size());
/* 39:47 */     for (Map.Entry localEntry : this.a.entrySet())
/* 40:   */     {
/* 41:48 */       paramhd.a(((tq)localEntry.getKey()).e);
/* 42:49 */       paramhd.b(((Integer)localEntry.getValue()).intValue());
/* 43:   */     }
/* 44:   */   }
/* 45:   */   
/* 46:   */   public Map a()
/* 47:   */   {
/* 48:54 */     return this.a;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     is
 * JD-Core Version:    0.7.0.1
 */