/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bka
/*   5:    */   extends bkb
/*   6:    */ {
/*   7:    */   private boolean b;
/*   8:    */   
/*   9:    */   public bka() {}
/*  10:    */   
/*  11:    */   public bka(int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*  12:    */   {
/*  13:748 */     super(paramInt);
/*  14:    */     
/*  15:750 */     this.m = paramej;
/*  16:751 */     this.l = parambjb;
/*  17:    */   }
/*  18:    */   
/*  19:    */   protected void b(fn paramfn)
/*  20:    */   {
/*  21:756 */     super.b(paramfn);
/*  22:    */     
/*  23:758 */     this.b = paramfn.n("Mob");
/*  24:    */   }
/*  25:    */   
/*  26:    */   protected void a(fn paramfn)
/*  27:    */   {
/*  28:763 */     super.a(paramfn);
/*  29:    */     
/*  30:765 */     paramfn.a("Mob", this.b);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public static bka a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, ej paramej)
/*  34:    */   {
/*  35:769 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -2, 0, 0, 7, 8, 9, paramej);
/*  36:771 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  37:772 */       return null;
/*  38:    */     }
/*  39:775 */     return new bka(paramInt4, paramRandom, localbjb, paramej);
/*  40:    */   }
/*  41:    */   
/*  42:    */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  43:    */   {
/*  44:781 */     a(paramaqu, parambjb, 0, 2, 0, 6, 7, 7, aty.a.P(), aty.a.P(), false);
/*  45:    */     
/*  46:    */ 
/*  47:784 */     a(paramaqu, parambjb, 1, 0, 0, 5, 1, 7, aty.by.P(), aty.by.P(), false);
/*  48:785 */     a(paramaqu, parambjb, 1, 2, 1, 5, 2, 7, aty.by.P(), aty.by.P(), false);
/*  49:786 */     a(paramaqu, parambjb, 1, 3, 2, 5, 3, 7, aty.by.P(), aty.by.P(), false);
/*  50:787 */     a(paramaqu, parambjb, 1, 4, 3, 5, 4, 7, aty.by.P(), aty.by.P(), false);
/*  51:    */     
/*  52:    */ 
/*  53:790 */     a(paramaqu, parambjb, 1, 2, 0, 1, 4, 2, aty.by.P(), aty.by.P(), false);
/*  54:791 */     a(paramaqu, parambjb, 5, 2, 0, 5, 4, 2, aty.by.P(), aty.by.P(), false);
/*  55:792 */     a(paramaqu, parambjb, 1, 5, 2, 1, 5, 3, aty.by.P(), aty.by.P(), false);
/*  56:793 */     a(paramaqu, parambjb, 5, 5, 2, 5, 5, 3, aty.by.P(), aty.by.P(), false);
/*  57:794 */     a(paramaqu, parambjb, 0, 5, 3, 0, 5, 8, aty.by.P(), aty.by.P(), false);
/*  58:795 */     a(paramaqu, parambjb, 6, 5, 3, 6, 5, 8, aty.by.P(), aty.by.P(), false);
/*  59:796 */     a(paramaqu, parambjb, 1, 5, 8, 5, 5, 8, aty.by.P(), aty.by.P(), false);
/*  60:    */     
/*  61:798 */     a(paramaqu, aty.bz.P(), 1, 6, 3, parambjb);
/*  62:799 */     a(paramaqu, aty.bz.P(), 5, 6, 3, parambjb);
/*  63:800 */     a(paramaqu, parambjb, 0, 6, 3, 0, 6, 8, aty.bz.P(), aty.bz.P(), false);
/*  64:801 */     a(paramaqu, parambjb, 6, 6, 3, 6, 6, 8, aty.bz.P(), aty.bz.P(), false);
/*  65:802 */     a(paramaqu, parambjb, 1, 6, 8, 5, 7, 8, aty.bz.P(), aty.bz.P(), false);
/*  66:803 */     a(paramaqu, parambjb, 2, 8, 8, 4, 8, 8, aty.bz.P(), aty.bz.P(), false);
/*  67:805 */     if (!this.b)
/*  68:    */     {
/*  69:806 */       dt localdt = new dt(a(3, 5), d(5), b(3, 5));
/*  70:807 */       if (parambjb.b(localdt))
/*  71:    */       {
/*  72:808 */         this.b = true;
/*  73:809 */         paramaqu.a(localdt, aty.ac.P(), 2);
/*  74:    */         
/*  75:811 */         bcm localbcm = paramaqu.s(localdt);
/*  76:812 */         if ((localbcm instanceof bdg)) {
/*  77:813 */           ((bdg)localbcm).b().a("Blaze");
/*  78:    */         }
/*  79:    */       }
/*  80:    */     }
/*  81:819 */     for (int i = 0; i <= 6; i++) {
/*  82:820 */       for (int j = 0; j <= 6; j++) {
/*  83:821 */         b(paramaqu, aty.by.P(), i, -1, j, parambjb);
/*  84:    */       }
/*  85:    */     }
/*  86:825 */     return true;
/*  87:    */   }
/*  88:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bka
 * JD-Core Version:    0.7.0.1
 */