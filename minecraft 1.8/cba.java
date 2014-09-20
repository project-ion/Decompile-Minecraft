/*  1:   */ import com.google.common.collect.ComparisonChain;
/*  2:   */ import com.mojang.authlib.GameProfile;
/*  3:   */ import java.util.Comparator;
/*  4:   */ 
/*  5:   */ final class cba
/*  6:   */   implements Comparator
/*  7:   */ {
/*  8:   */   public int a(ces paramces1, ces paramces2)
/*  9:   */   {
/* 10:26 */     return ComparisonChain.start().compare(paramces1.a().getId(), paramces2.a().getId()).result();
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cba
 * JD-Core Version:    0.7.0.1
 */