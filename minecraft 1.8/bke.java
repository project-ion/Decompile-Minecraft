/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bke
/*   5:    */   extends bkb
/*   6:    */ {
/*   7:    */   public bke() {}
/*   8:    */   
/*   9:    */   public bke(int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*  10:    */   {
/*  11:671 */     super(paramInt);
/*  12:    */     
/*  13:673 */     this.m = paramej;
/*  14:674 */     this.l = parambjb;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*  18:    */   {
/*  19:679 */     c((bkf)parambms, paramList, paramRandom, 6, 2, false);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public static bke a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, ej paramej)
/*  23:    */   {
/*  24:683 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -2, 0, 0, 7, 11, 7, paramej);
/*  25:685 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  26:686 */       return null;
/*  27:    */     }
/*  28:689 */     return new bke(paramInt4, paramRandom, localbjb, paramej);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  32:    */   {
/*  33:695 */     a(paramaqu, parambjb, 0, 0, 0, 6, 1, 6, aty.by.P(), aty.by.P(), false);
/*  34:    */     
/*  35:697 */     a(paramaqu, parambjb, 0, 2, 0, 6, 10, 6, aty.a.P(), aty.a.P(), false);
/*  36:    */     
/*  37:    */ 
/*  38:700 */     a(paramaqu, parambjb, 0, 2, 0, 1, 8, 0, aty.by.P(), aty.by.P(), false);
/*  39:701 */     a(paramaqu, parambjb, 5, 2, 0, 6, 8, 0, aty.by.P(), aty.by.P(), false);
/*  40:702 */     a(paramaqu, parambjb, 0, 2, 1, 0, 8, 6, aty.by.P(), aty.by.P(), false);
/*  41:703 */     a(paramaqu, parambjb, 6, 2, 1, 6, 8, 6, aty.by.P(), aty.by.P(), false);
/*  42:704 */     a(paramaqu, parambjb, 1, 2, 6, 5, 8, 6, aty.by.P(), aty.by.P(), false);
/*  43:    */     
/*  44:    */ 
/*  45:707 */     a(paramaqu, parambjb, 0, 3, 2, 0, 5, 4, aty.bz.P(), aty.bz.P(), false);
/*  46:708 */     a(paramaqu, parambjb, 6, 3, 2, 6, 5, 2, aty.bz.P(), aty.bz.P(), false);
/*  47:709 */     a(paramaqu, parambjb, 6, 3, 4, 6, 5, 4, aty.bz.P(), aty.bz.P(), false);
/*  48:    */     
/*  49:    */ 
/*  50:712 */     a(paramaqu, aty.by.P(), 5, 2, 5, parambjb);
/*  51:713 */     a(paramaqu, parambjb, 4, 2, 5, 4, 3, 5, aty.by.P(), aty.by.P(), false);
/*  52:714 */     a(paramaqu, parambjb, 3, 2, 5, 3, 4, 5, aty.by.P(), aty.by.P(), false);
/*  53:715 */     a(paramaqu, parambjb, 2, 2, 5, 2, 5, 5, aty.by.P(), aty.by.P(), false);
/*  54:716 */     a(paramaqu, parambjb, 1, 2, 5, 1, 6, 5, aty.by.P(), aty.by.P(), false);
/*  55:    */     
/*  56:    */ 
/*  57:719 */     a(paramaqu, parambjb, 1, 7, 1, 5, 7, 4, aty.by.P(), aty.by.P(), false);
/*  58:720 */     a(paramaqu, parambjb, 6, 8, 2, 6, 8, 4, aty.a.P(), aty.a.P(), false);
/*  59:    */     
/*  60:    */ 
/*  61:723 */     a(paramaqu, parambjb, 2, 6, 0, 4, 8, 0, aty.by.P(), aty.by.P(), false);
/*  62:724 */     a(paramaqu, parambjb, 2, 5, 0, 4, 5, 0, aty.bz.P(), aty.bz.P(), false);
/*  63:726 */     for (int i = 0; i <= 6; i++) {
/*  64:727 */       for (int j = 0; j <= 6; j++) {
/*  65:728 */         b(paramaqu, aty.by.P(), i, -1, j, parambjb);
/*  66:    */       }
/*  67:    */     }
/*  68:732 */     return true;
/*  69:    */   }
/*  70:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bke
 * JD-Core Version:    0.7.0.1
 */