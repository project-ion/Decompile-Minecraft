/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import java.util.Map;
/*   3:    */ import java.util.Map.Entry;
/*   4:    */ import java.util.UUID;
/*   5:    */ import net.minecraft.server.MinecraftServer;
/*   6:    */ 
/*   7:    */ final class aq
/*   8:    */   implements Predicate
/*   9:    */ {
/*  10:    */   aq(Map paramMap) {}
/*  11:    */   
/*  12:    */   public boolean a(wv paramwv)
/*  13:    */   {
/*  14:271 */     bsd localbsd = MinecraftServer.M().a(0).Z();
/*  15:272 */     for (Map.Entry localEntry : this.a.entrySet())
/*  16:    */     {
/*  17:273 */       String str1 = (String)localEntry.getKey();
/*  18:274 */       int i = 0;
/*  19:276 */       if ((str1.endsWith("_min")) && (str1.length() > 4))
/*  20:    */       {
/*  21:277 */         i = 1;
/*  22:278 */         str1 = str1.substring(0, str1.length() - 4);
/*  23:    */       }
/*  24:281 */       bry localbry = localbsd.b(str1);
/*  25:282 */       if (localbry == null) {
/*  26:283 */         return false;
/*  27:    */       }
/*  28:285 */       String str2 = (paramwv instanceof qw) ? paramwv.d_() : paramwv.aJ().toString();
/*  29:286 */       if (!localbsd.b(str2, localbry)) {
/*  30:287 */         return false;
/*  31:    */       }
/*  32:289 */       bsa localbsa = localbsd.c(str2, localbry);
/*  33:290 */       int j = localbsa.c();
/*  34:292 */       if ((j < ((Integer)localEntry.getValue()).intValue()) && (i != 0)) {
/*  35:293 */         return false;
/*  36:    */       }
/*  37:294 */       if ((j > ((Integer)localEntry.getValue()).intValue()) && (i == 0)) {
/*  38:295 */         return false;
/*  39:    */       }
/*  40:    */     }
/*  41:299 */     return true;
/*  42:    */   }
/*  43:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aq
 * JD-Core Version:    0.7.0.1
 */