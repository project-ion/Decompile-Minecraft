/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ import com.google.common.collect.Maps;
/*  3:   */ import java.util.Collection;
/*  4:   */ import java.util.Map;
/*  5:   */ import java.util.Map.Entry;
/*  6:   */ 
/*  7:   */ public class beq
/*  8:   */   implements Predicate
/*  9:   */ {
/* 10:   */   private final bed a;
/* 11:15 */   private final Map b = Maps.newHashMap();
/* 12:   */   
/* 13:   */   private beq(bed parambed)
/* 14:   */   {
/* 15:18 */     this.a = parambed;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public static beq a(atr paramatr)
/* 19:   */   {
/* 20:22 */     return new beq(paramatr.O());
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean a(bec parambec)
/* 24:   */   {
/* 25:32 */     if ((parambec == null) || (!parambec.c().equals(this.a.c()))) {
/* 26:33 */       return false;
/* 27:   */     }
/* 28:36 */     for (Map.Entry localEntry : this.b.entrySet())
/* 29:   */     {
/* 30:37 */       Comparable localComparable = parambec.b((bex)localEntry.getKey());
/* 31:38 */       if (!((Predicate)localEntry.getValue()).apply(localComparable)) {
/* 32:39 */         return false;
/* 33:   */       }
/* 34:   */     }
/* 35:43 */     return true;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public beq a(bex parambex, Predicate paramPredicate)
/* 39:   */   {
/* 40:47 */     if (!this.a.d().contains(parambex)) {
/* 41:48 */       throw new IllegalArgumentException(this.a + " cannot support property " + parambex);
/* 42:   */     }
/* 43:50 */     this.b.put(parambex, paramPredicate);
/* 44:51 */     return this;
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     beq
 * JD-Core Version:    0.7.0.1
 */