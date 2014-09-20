/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ import java.util.Map.Entry;
/*  4:   */ 
/*  5:   */ public abstract class cnc
/*  6:   */   implements cni
/*  7:   */ {
/*  8:12 */   protected Map b = Maps.newLinkedHashMap();
/*  9:   */   
/* 10:   */   public String a(Map paramMap)
/* 11:   */   {
/* 12:15 */     StringBuilder localStringBuilder = new StringBuilder();
/* 13:16 */     for (Map.Entry localEntry : paramMap.entrySet())
/* 14:   */     {
/* 15:17 */       if (localStringBuilder.length() != 0) {
/* 16:18 */         localStringBuilder.append(",");
/* 17:   */       }
/* 18:21 */       bex localbex = (bex)localEntry.getKey();
/* 19:22 */       Comparable localComparable = (Comparable)localEntry.getValue();
/* 20:23 */       localStringBuilder.append(localbex.a());
/* 21:24 */       localStringBuilder.append("=");
/* 22:25 */       localStringBuilder.append(localbex.a(localComparable));
/* 23:   */     }
/* 24:28 */     if (localStringBuilder.length() == 0) {
/* 25:29 */       localStringBuilder.append("normal");
/* 26:   */     }
/* 27:32 */     return localStringBuilder.toString();
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Map a(atr paramatr)
/* 31:   */   {
/* 32:37 */     for (bec localbec : paramatr.O().a()) {
/* 33:38 */       this.b.put(localbec, a(localbec));
/* 34:   */     }
/* 35:40 */     return this.b;
/* 36:   */   }
/* 37:   */   
/* 38:   */   protected abstract cxl a(bec parambec);
/* 39:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cnc
 * JD-Core Version:    0.7.0.1
 */