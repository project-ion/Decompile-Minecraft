/*  1:   */ import com.google.common.base.Function;
/*  2:   */ import java.util.Map.Entry;
/*  3:   */ 
/*  4:   */ final class beb
/*  5:   */   implements Function
/*  6:   */ {
/*  7:   */   public String a(Map.Entry paramEntry)
/*  8:   */   {
/*  9:20 */     if (paramEntry == null) {
/* 10:21 */       return "<NULL>";
/* 11:   */     }
/* 12:24 */     bex localbex = (bex)paramEntry.getKey();
/* 13:25 */     return localbex.a() + "=" + localbex.a((Comparable)paramEntry.getValue());
/* 14:   */   }
/* 15:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     beb
 * JD-Core Version:    0.7.0.1
 */