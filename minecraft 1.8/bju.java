/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bju
/*   5:    */   extends bkb
/*   6:    */ {
/*   7:    */   public bju() {}
/*   8:    */   
/*   9:    */   public bju(int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*  10:    */   {
/*  11:839 */     super(paramInt);
/*  12:    */     
/*  13:841 */     this.m = paramej;
/*  14:842 */     this.l = parambjb;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*  18:    */   {
/*  19:847 */     a((bkf)parambms, paramList, paramRandom, 5, 3, true);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public static bju a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*  23:    */   {
/*  24:851 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -5, -3, 0, 13, 14, 13, paramej);
/*  25:853 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  26:854 */       return null;
/*  27:    */     }
/*  28:857 */     return new bju(paramInt4, paramRandom, localbjb, paramej);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  32:    */   {
/*  33:863 */     a(paramaqu, parambjb, 0, 3, 0, 12, 4, 12, aty.by.P(), aty.by.P(), false);
/*  34:    */     
/*  35:865 */     a(paramaqu, parambjb, 0, 5, 0, 12, 13, 12, aty.a.P(), aty.a.P(), false);
/*  36:    */     
/*  37:    */ 
/*  38:868 */     a(paramaqu, parambjb, 0, 5, 0, 1, 12, 12, aty.by.P(), aty.by.P(), false);
/*  39:869 */     a(paramaqu, parambjb, 11, 5, 0, 12, 12, 12, aty.by.P(), aty.by.P(), false);
/*  40:870 */     a(paramaqu, parambjb, 2, 5, 11, 4, 12, 12, aty.by.P(), aty.by.P(), false);
/*  41:871 */     a(paramaqu, parambjb, 8, 5, 11, 10, 12, 12, aty.by.P(), aty.by.P(), false);
/*  42:872 */     a(paramaqu, parambjb, 5, 9, 11, 7, 12, 12, aty.by.P(), aty.by.P(), false);
/*  43:873 */     a(paramaqu, parambjb, 2, 5, 0, 4, 12, 1, aty.by.P(), aty.by.P(), false);
/*  44:874 */     a(paramaqu, parambjb, 8, 5, 0, 10, 12, 1, aty.by.P(), aty.by.P(), false);
/*  45:875 */     a(paramaqu, parambjb, 5, 9, 0, 7, 12, 1, aty.by.P(), aty.by.P(), false);
/*  46:    */     
/*  47:    */ 
/*  48:878 */     a(paramaqu, parambjb, 2, 11, 2, 10, 12, 10, aty.by.P(), aty.by.P(), false);
/*  49:    */     
/*  50:    */ 
/*  51:881 */     a(paramaqu, parambjb, 5, 8, 0, 7, 8, 0, aty.bz.P(), aty.bz.P(), false);
/*  52:884 */     for (int i = 1; i <= 11; i += 2)
/*  53:    */     {
/*  54:885 */       a(paramaqu, parambjb, i, 10, 0, i, 11, 0, aty.bz.P(), aty.bz.P(), false);
/*  55:886 */       a(paramaqu, parambjb, i, 10, 12, i, 11, 12, aty.bz.P(), aty.bz.P(), false);
/*  56:887 */       a(paramaqu, parambjb, 0, 10, i, 0, 11, i, aty.bz.P(), aty.bz.P(), false);
/*  57:888 */       a(paramaqu, parambjb, 12, 10, i, 12, 11, i, aty.bz.P(), aty.bz.P(), false);
/*  58:889 */       a(paramaqu, aty.by.P(), i, 13, 0, parambjb);
/*  59:890 */       a(paramaqu, aty.by.P(), i, 13, 12, parambjb);
/*  60:891 */       a(paramaqu, aty.by.P(), 0, 13, i, parambjb);
/*  61:892 */       a(paramaqu, aty.by.P(), 12, 13, i, parambjb);
/*  62:893 */       a(paramaqu, aty.bz.P(), i + 1, 13, 0, parambjb);
/*  63:894 */       a(paramaqu, aty.bz.P(), i + 1, 13, 12, parambjb);
/*  64:895 */       a(paramaqu, aty.bz.P(), 0, 13, i + 1, parambjb);
/*  65:896 */       a(paramaqu, aty.bz.P(), 12, 13, i + 1, parambjb);
/*  66:    */     }
/*  67:898 */     a(paramaqu, aty.bz.P(), 0, 13, 0, parambjb);
/*  68:899 */     a(paramaqu, aty.bz.P(), 0, 13, 12, parambjb);
/*  69:900 */     a(paramaqu, aty.bz.P(), 0, 13, 0, parambjb);
/*  70:901 */     a(paramaqu, aty.bz.P(), 12, 13, 0, parambjb);
/*  71:904 */     for (i = 3; i <= 9; i += 2)
/*  72:    */     {
/*  73:905 */       a(paramaqu, parambjb, 1, 7, i, 1, 8, i, aty.bz.P(), aty.bz.P(), false);
/*  74:906 */       a(paramaqu, parambjb, 11, 7, i, 11, 8, i, aty.bz.P(), aty.bz.P(), false);
/*  75:    */     }
/*  76:910 */     a(paramaqu, parambjb, 4, 2, 0, 8, 2, 12, aty.by.P(), aty.by.P(), false);
/*  77:911 */     a(paramaqu, parambjb, 0, 2, 4, 12, 2, 8, aty.by.P(), aty.by.P(), false);
/*  78:    */     
/*  79:913 */     a(paramaqu, parambjb, 4, 0, 0, 8, 1, 3, aty.by.P(), aty.by.P(), false);
/*  80:914 */     a(paramaqu, parambjb, 4, 0, 9, 8, 1, 12, aty.by.P(), aty.by.P(), false);
/*  81:915 */     a(paramaqu, parambjb, 0, 0, 4, 3, 1, 8, aty.by.P(), aty.by.P(), false);
/*  82:916 */     a(paramaqu, parambjb, 9, 0, 4, 12, 1, 8, aty.by.P(), aty.by.P(), false);
/*  83:    */     int j;
/*  84:918 */     for (i = 4; i <= 8; i++) {
/*  85:919 */       for (j = 0; j <= 2; j++)
/*  86:    */       {
/*  87:920 */         b(paramaqu, aty.by.P(), i, -1, j, parambjb);
/*  88:921 */         b(paramaqu, aty.by.P(), i, -1, 12 - j, parambjb);
/*  89:    */       }
/*  90:    */     }
/*  91:924 */     for (i = 0; i <= 2; i++) {
/*  92:925 */       for (j = 4; j <= 8; j++)
/*  93:    */       {
/*  94:926 */         b(paramaqu, aty.by.P(), i, -1, j, parambjb);
/*  95:927 */         b(paramaqu, aty.by.P(), 12 - i, -1, j, parambjb);
/*  96:    */       }
/*  97:    */     }
/*  98:932 */     a(paramaqu, parambjb, 5, 5, 5, 7, 5, 7, aty.by.P(), aty.by.P(), false);
/*  99:933 */     a(paramaqu, parambjb, 6, 1, 6, 6, 4, 6, aty.a.P(), aty.a.P(), false);
/* 100:934 */     a(paramaqu, aty.by.P(), 6, 0, 6, parambjb);
/* 101:935 */     a(paramaqu, aty.k.P(), 6, 5, 6, parambjb);
/* 102:    */     
/* 103:937 */     dt localdt = new dt(a(6, 6), d(5), b(6, 6));
/* 104:938 */     if (parambjb.b(localdt)) {
/* 105:939 */       paramaqu.a(aty.k, localdt, paramRandom);
/* 106:    */     }
/* 107:942 */     return true;
/* 108:    */   }
/* 109:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bju
 * JD-Core Version:    0.7.0.1
 */